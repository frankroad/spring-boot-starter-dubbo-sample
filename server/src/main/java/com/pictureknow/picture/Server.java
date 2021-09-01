package com.pictureknow.picture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author yank
 * 2018/1/19
 */
@SpringBootApplication
@ComponentScan("com.pictureknow.picture.service")
@ImportResource("classpath:spring/spring-provider.xml")
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }
}
