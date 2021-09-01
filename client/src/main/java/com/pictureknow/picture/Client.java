package com.pictureknow.picture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author yank
 * 2018/1/19
 */
@SpringBootApplication
@ComponentScan("com.pictureknow.picture.client")
@ImportResource("classpath:spring/spring-customer.xml")
public class Client {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Client.class, args);
    }
}
