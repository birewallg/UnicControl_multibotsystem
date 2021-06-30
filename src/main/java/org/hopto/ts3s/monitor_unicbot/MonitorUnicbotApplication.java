package org.hopto.ts3s.monitor_unicbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MonitorUnicbotApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitorUnicbotApplication.class, args);

        /*BotInline botCore = new BotInline();
        botCore.run(args);*/
    }

}
