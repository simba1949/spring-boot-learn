package vip.openpark.start.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.openpark.start.domain.User;

/**
 * @author anthony
 * @version 2023/4/4
 */
@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    @PostMapping
    public User insertAndGetUser(@RequestBody User user){
        log.info("the user what is {}", user);
        return user;
    }
}
