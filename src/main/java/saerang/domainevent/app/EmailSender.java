package saerang.domainevent.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;
import saerang.domainevent.domain.UserCreatedEvent;

@Slf4j
@Component
public class EmailSender {

    @Async
    @TransactionalEventListener
    void onUserCreated(UserCreatedEvent event) {
        log.info("EmailSender: onUserCreated - " + event.getUser().getName());
    }
}
