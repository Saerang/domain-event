package saerang.domainevent.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import saerang.domainevent.domain.UserCreatedEvent;

@Service
@Slf4j
public class OrderService {

    @EventListener(UserCreatedEvent.class)
    void onUserCreated(UserCreatedEvent event) {
        log.info("OrderService " + event.getUser());
    }
}
