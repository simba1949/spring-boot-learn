package vip.openpark.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import vip.openpark.domain.UserEntity;

import java.time.LocalDateTime;

/**
 * spring-boot-start-test 和 junit4 整合
 * 需要使用 @RunWith(SpringRunner.class) 、@SpringBootTest 两个注解
 * @author anthony
 * @version 2023/4/6
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class Junit4Test {

    @Autowired
    private UserController userController;

    /**
     * 注意这里的 @Test 注解全路径是：org.junit.Test
     */
    @Test
    public void insertTest(){
        UserEntity userEntity = UserEntity.builder().username("李白").gmtCreate(LocalDateTime.now()).build();

        String result = userController.insert(userEntity);

        log.info("响应结果为{}", result);
    }
}
