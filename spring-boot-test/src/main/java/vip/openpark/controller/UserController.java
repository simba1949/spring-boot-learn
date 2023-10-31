package vip.openpark.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import vip.openpark.domain.UserEntity;

/**
 * @author anthony
 * @version 2023/4/6
 */
@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    @PostMapping
    public String insert(@RequestBody UserEntity userEntity){
        log.info("新增接口入参：{}", userEntity);

        return "SUCCESS";
    }
}
