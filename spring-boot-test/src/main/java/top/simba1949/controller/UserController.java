package top.simba1949.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import top.simba1949.domain.UserEntity;

/**
 * @author anthony
 * @date 2023/4/6
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
