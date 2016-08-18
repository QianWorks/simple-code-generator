package me.qiancheng.qianworks.codegen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * <p>
 * mvn spring-boot:run -Dserver.port=8080
 *
 * @author <a href="i@qiancheng.me">千橙</a>
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
