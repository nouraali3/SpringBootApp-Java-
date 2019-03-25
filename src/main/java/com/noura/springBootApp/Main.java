package com.noura.springBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan({"com.noura.controller"})
@ComponentScan({"com.noura.service"})
@ComponentScan({"com.noura.dao"})
@ComponentScan({"com.noura.entity"})
@ComponentScan({"com.noura.transaction"})

public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(Main.class,args); 
    }
}
