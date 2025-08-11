package com.e2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.e2")
public class Main {
    public static void main(String[] args) {
        /* The bean factory cycle.
        // Spring generates beans or instances based on the configuration and the
        // POJOs. Example, @Component + a class definition (POJO) through a constructor
        POJO + Configs = Spring Context
        */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        Hello hello = context.getBean(Hello.class);
        System.out.println(hello.greeting());
        }
    }