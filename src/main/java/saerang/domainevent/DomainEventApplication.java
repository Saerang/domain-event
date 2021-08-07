package saerang.domainevent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class DomainEventApplication implements ApplicationListener {

    public static void main(String[] args) {
        SpringApplication.run(DomainEventApplication.class, args);
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {

    }
}
