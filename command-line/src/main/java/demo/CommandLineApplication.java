package demo;

import hello.HelloService;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CommandLineApplication {

    // uncomment to demonstrate that the auto-configuration backs off if necessary
    /*
    @Bean
    public HelloService customHelloService() {
        return new HelloService() {
            @Override
            public void sayHello() {
                LoggerFactory.getLogger(CommandLineApplication.class).info("Hello from Logs");
            }
        };
    }
    */

    public static void main(String[] args) {
        SpringApplication.run(CommandLineApplication.class, args);
    }
}
