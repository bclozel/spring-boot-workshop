package demo;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    @Bean
    public HealthIndicator randomHealthIndicator() {

        return new HealthIndicator() {
            @Override
            public Health health() {
                if(new Random().nextBoolean()) {
                    return Health.down().withException(new RuntimeException("Something went wrong")).build();
                } else {
                    return Health.up().build();
                }
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
