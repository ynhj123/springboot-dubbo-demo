package com.dubboDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @date: 2022-04-14
 * @author: yangniuhaojiang
 * @title: ConsumerApplication
 * @version: 1.0
 * @description： update_version: update_date: update_author: update_note:
 */
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ConsumerApplication.class, args);
    }
}
