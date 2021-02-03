package com.yp.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //spring的启动注解， 启动时会自动扫描各种注解组件
/**
 * springboot的启动类
 */
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

    }
}
