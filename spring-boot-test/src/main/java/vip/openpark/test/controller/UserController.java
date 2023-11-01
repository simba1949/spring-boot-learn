package vip.openpark.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import vip.openpark.test.domain.UserEntity;

import java.time.LocalDateTime;

/**
 * @author anthony
 * @version 2023/4/6
 */
@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping
    public UserEntity get(){
        log.info("进入 GET 请求");

        return UserEntity.builder()
                .id(1L)
                .username("李白")
                .gmtCreate(LocalDateTime.now())
                .build();
    }

    @PostMapping
    public String add(@RequestBody UserEntity userEntity){
        log.info("进入 POST 请求");

        log.info("新增接口入参：{}", userEntity);

        return "SUCCESS";
    }
}