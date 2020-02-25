package com.sikiedu.lombok;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jianggang
 * @date 2019/6/28 15:45:58
 * @description
 */
@Slf4j
@SpringBootApplication
public class Application {

//    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        int a =0;
        log.info("------------------>日志的含义：{},{}",a,a);
        SpringApplication.run(Application.class);
    }
}
