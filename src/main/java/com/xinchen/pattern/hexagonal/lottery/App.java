package com.xinchen.pattern.hexagonal.lottery;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.xinchen.pattern.hexagonal.lottery.administration.ConsoleAdministration;
import com.xinchen.pattern.hexagonal.lottery.banking.WireTransfers;
import com.xinchen.pattern.hexagonal.lottery.database.LotteryTicketRepository;
import com.xinchen.pattern.hexagonal.lottery.domain.LotteryAdministration;
import com.xinchen.pattern.hexagonal.lottery.domain.LotteryService;
import com.xinchen.pattern.hexagonal.lottery.eventlog.LotteryEventLog;
import com.xinchen.pattern.hexagonal.lottery.module.LotteryModule;
import com.xinchen.pattern.hexagonal.lottery.module.LotteryTestingModule;
import com.xinchen.pattern.hexagonal.lottery.mongo.MongoConnectionPropertiesLoader;
import com.xinchen.pattern.hexagonal.lottery.service.ConsoleLottery;
import com.xinchen.pattern.hexagonal.lottery.simpledata.SampleData;
import de.svenkubiak.embeddedmongodb.EmbeddedMongo;

/**
 *
 * Hexagonal Architecture pattern decouples the application core from the
 * services it uses. This allows the services to be plugged in and the
 * application will run with or without the services.<p>
 *
 * The core logic, or business logic, of an application consists of the
 * algorithms that are essential to its purpose. They implement the use
 * cases that are the heart of the application. When you change them, you
 * change the essence of the application.<p>
 *
 * The services are not essential. They can be replaced without changing
 * the purpose of the application. Examples: database access and other
 * types of storage, user interface components, e-mail and other
 * communication components, hardware devices.<p>
 *
 * This example demonstrates Hexagonal Architecture with a lottery system.
 * The application core is separate from the services that drive it and
 * from the services it uses.<p>
 *
 * The primary ports for the application are console interfaces
 * {@link ConsoleAdministration} through which the lottery round is
 * initiated and run and {@link ConsoleLottery} that allows players to
 * submit lottery tickets for the draw.<p>
 *
 * The secondary ports that application core uses are {@link WireTransfers}
 * which is a banking service, {@link LotteryEventLog} that delivers
 * eventlog as lottery events occur and {@link LotteryTicketRepository}
 * that is the storage for the lottery tickets.
 *
 * 此示例演示了具有彩票系统的六角建筑。
 *
 * 应用程序核心与驱动它的服务是分开的来自其使用的服务。<p>
 *
 * 应用程序的主要端口是控制台接口{@link ConsoleAdministration}，彩票回合通过启动并运行，并通过{@link ConsoleLottery}允许玩家提交抽奖彩票。<p>
 *
 * 应用程序核心使用的辅助端口是{@link WireTransfers}这是一项银行服务，
 * {@link LotteryEventLog}可以提供发生彩票事件和{@link LotteryTicketRepository}时的事件日志这是彩票的存放地。
 *
 *
 * @author xinchen
 * @version 1.0
 * @date 05/08/2020 13:32
 */
public class App {
    /**
     * Program entry point
     */
    public static void main(String[] args) {


        Injector injector = test();

        // start new lottery round
        LotteryAdministration administartion = injector.getInstance(LotteryAdministration.class);
        administartion.resetLottery();

        // submit some lottery tickets
        LotteryService service = injector.getInstance(LotteryService.class);
        SampleData.submitTickets(service, 20);

        // perform lottery
        administartion.performLottery();
    }

    static Injector test(){
        return Guice.createInjector(new LotteryTestingModule());
    }

    static Injector production(){
        // 加载mongo环境变量
        MongoConnectionPropertiesLoader.load();
        EmbeddedMongo.DB.port(27017).start();
        return Guice.createInjector(new LotteryModule());
    }
}
