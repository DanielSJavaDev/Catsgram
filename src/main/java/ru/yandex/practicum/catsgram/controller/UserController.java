
package ru.yandex.practicum.catsgram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.catsgram.exception.InvalidEmailException;
import ru.yandex.practicum.catsgram.exception.UserAlreadyExistException;
import ru.yandex.practicum.catsgram.model.Post;
import ru.yandex.practicum.catsgram.model.User;
import ru.yandex.practicum.catsgram.service.UserService;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Collection<User> findAll() {
        return userService.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) throws UserAlreadyExistException, InvalidEmailException {
        return userService.createUser(user);
    }

    @PutMapping
    public User updateUser(@RequestBody User user) throws InvalidEmailException {
        return userService.updateUser(user);
    }
    @GetMapping("/user/{userMail}")
    public User getUser(@PathVariable("userMail") String userMail){
        return userService.findUserByEmail(userMail);
    }
}