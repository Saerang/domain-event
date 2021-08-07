package saerang.domainevent.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import saerang.domainevent.app.UserService;
import saerang.domainevent.domain.User;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/user")
    public String addUser() {
        User user = new User();
        user.setName("saerang");

        user = userService.addUser();
        return "User " + user.getId() + " Created";
    }
}
