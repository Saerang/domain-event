package saerang.domainevent.domain;

import lombok.Data;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class User extends AbstractAggregateRoot<User> {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public void create(String name) {
        this.name = name;

        UserCreatedEvent event = new UserCreatedEvent(this);
        this.registerEvent(event);
    }

    public void update(String name) {

    }

}
