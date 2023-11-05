package vip.openpark.actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anthony
 * @version 2019/7/9 21:04
 */
@RestController
@RequestMapping("hw")
public class HelloWorldController {

    @GetMapping
    public String say() {
        return "HELLO WORLD!";
    }
}