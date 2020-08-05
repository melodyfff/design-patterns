package com.xinchen.pattern.hexagonal.lottery.administration;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.xinchen.pattern.hexagonal.lottery.domain.LotteryAdministration;
import com.xinchen.pattern.hexagonal.lottery.domain.LotteryNumbers;
import com.xinchen.pattern.hexagonal.lottery.domain.LotteryService;
import com.xinchen.pattern.hexagonal.lottery.module.LotteryModule;
import com.xinchen.pattern.hexagonal.lottery.mongo.MongoConnectionPropertiesLoader;
import com.xinchen.pattern.hexagonal.lottery.simpledata.SampleData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Console interface for lottery administration
 *
 * @author xinchen
 * @version 1.0
 * @date 05/08/2020 17:00
 */
public class ConsoleAdministration {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConsoleAdministration.class);

    /**
     * Program entry point
     */
    public static void main(String[] args) {
        MongoConnectionPropertiesLoader.load();
        Injector injector = Guice.createInjector(new LotteryModule());
        LotteryAdministration administartion = injector.getInstance(LotteryAdministration.class);
        LotteryService service = injector.getInstance(LotteryService.class);
        SampleData.submitTickets(service, 20);
        try (Scanner scanner = new Scanner(System.in)) {
            boolean exit = false;
            while (!exit) {
                printMainMenu();
                String cmd = readString(scanner);
                if ("1".equals(cmd)) {
                    administartion.getAllSubmittedTickets().forEach((k, v) -> LOGGER.info("Key: {}, Value: {}", k, v));
                } else if ("2".equals(cmd)) {
                    LotteryNumbers numbers = administartion.performLottery();
                    LOGGER.info("The winning numbers: {}", numbers.getNumbersAsString());
                    LOGGER.info("Time to reset the database for next round, eh?");
                } else if ("3".equals(cmd)) {
                    administartion.resetLottery();
                    LOGGER.info("The lottery ticket database was cleared.");
                } else if ("4".equals(cmd)) {
                    exit = true;
                } else {
                    LOGGER.info("Unknown command: {}", cmd);
                }
            }
        }
    }

    private static void printMainMenu() {
        LOGGER.info("");
        LOGGER.info("### Lottery Administration Console ###");
        LOGGER.info("(1) Show all submitted tickets");
        LOGGER.info("(2) Perform lottery draw");
        LOGGER.info("(3) Reset lottery ticket database");
        LOGGER.info("(4) Exit");
    }

    private static String readString(Scanner scanner) {
        System.out.print("> ");
        return scanner.next();
    }
}
