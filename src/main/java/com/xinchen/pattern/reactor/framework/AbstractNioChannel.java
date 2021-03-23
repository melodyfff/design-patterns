package com.xinchen.pattern.reactor.framework;

import java.nio.channels.SelectableChannel;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * This represents the <i>Handle</i> of Reactor pattern.
 *
 * These are resources managed by OS which can be submitted to {@link NioReactor}.
 *
 * <p>This class serves has the responsibility of reading the data when a read event occurs and
 * writing the data back when the channel is writable. It leaves the reading and writing of data on
 * the concrete implementation. It provides a block writing mechanism wherein when any {@link
 * ChannelHandler} wants to write data back, it queues the data in pending write queue and clears it
 * in block manner. This provides better throughput.
 *
 * @author xin chen
 * @version 1.0.0
 * @date 2021/3/23 15:58
 */

public abstract class AbstractNioChannel {
    private final SelectableChannel channel;
    private final ChannelHandler handler;
    private final Map<SelectableChannel, Queue<Object>> channelToPendingWrites;

    private NioReactor reactor;

    /**
     * Creates a new channel.
     *
     * @param handler which will handle events occurring on this channel.
     * @param channel a NIO channel to be wrapped.
     */
    public AbstractNioChannel(ChannelHandler handler, SelectableChannel channel) {
        this.handler = handler;
        this.channel = channel;
        this.channelToPendingWrites = new ConcurrentHashMap<>();
    }
}
