package saerang.domainevent.app;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import saerang.domainevent.domain.User;
import saerang.domainevent.domain.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public User addUser() {
        User user = new User();
        user.create("saerang");

        userRepository.save(user);

        return user;
    }
}
