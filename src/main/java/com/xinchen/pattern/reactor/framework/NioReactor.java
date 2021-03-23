package com.xinchen.pattern.reactor.framework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.channels.Selector;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * This class acts as Synchronous Event De-multiplexer and Initiation Dispatcher of Reactor pattern.
 *
 * Multiple handles i.e. {@link AbstractNioChannel}s can be registered to the reactor and it blocks
 * for events from all these handles. Whenever an event occurs on any of the registered handles, it
 * synchronously de-multiplexes the event which can be any of read, write or accept, and dispatches
 * the event to the appropriate {@link ChannelHandler} using the {@link Dispatcher}.
 *
 * <p>Implementation: A NIO reactor runs in its own thread when it is started using {@link
 * #start()} method. {@link NioReactor} uses {@link Selector} for realizing Synchronous Event
 * De-multiplexing.
 *
 * <p>NOTE: This is one of the ways to implement NIO reactor and it does not take care of all
 * possible edge cases which are required in a real application. This implementation is meant to
 * demonstrate the fundamental concepts that lie behind Reactor pattern.
 *
 * @author xin chen
 * @version 1.0.0
 * @date 2021/3/23 16:27
 */
public class NioReactor {
    private static final Logger LOGGER = LoggerFactory.getLogger(NioReactor.class);

    private final Selector selector;
    private final Dispatcher dispatcher;
    /**
     * All the work of altering the SelectionKey operations and Selector operations are performed in
     * the context of main event loop of reactor. So when any channel needs to change its readability
     * or writability, a new command is added in the command queue and then the event loop picks up
     * the command and executes it in next iteration.
     */
    private final Queue<Runnable> pendingCommands = new ConcurrentLinkedQueue<>();
    private final ExecutorService reactorMain = Executors.newSingleThreadExecutor();

    /**
     * Creates a reactor which will use provided {@code dispatcher} to dispatch events. The
     * application can provide various implementations of dispatcher which suits its needs.
     *
     * @param dispatcher a non-null dispatcher used to dispatch events on registered channels.
     * @throws IOException if any I/O error occurs.
     */
    public NioReactor(Dispatcher dispatcher) throws IOException {
        this.dispatcher = dispatcher;
        this.selector = Selector.open();
    }
}
