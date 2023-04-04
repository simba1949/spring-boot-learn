package top.simba1949.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.simba1949.domain.User;

/**
 * @author anthony
 * @date 2023/4/4
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
