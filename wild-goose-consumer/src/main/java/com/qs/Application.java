package com.qs;

//import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author FBin
 * @time 2019/1/21 10:24
 */
@SpringBootApplication
//@EnableDubboConfiguration
public class Application {

    public static void main(String[] args) {
        System.setProperty("dubbo.application.logger", "slf4j");
        SpringApplication.run(Application.class, args);
    }

}
