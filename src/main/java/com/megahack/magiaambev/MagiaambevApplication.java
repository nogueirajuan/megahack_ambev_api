package com.megahack.magiaambev;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
@EnableAdminServer
public class MagiaambevApplication {

    public static void main(String[] args) {
        SpringApplication.run(MagiaambevApplication.class, args);
    }

}
