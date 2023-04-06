package top.simba1949.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.simba1949.domain.UserEntity;

import java.time.LocalDateTime;

/**
 * spring-boot-start-test 和 junit5 整合，只需要使用 @SpringBootTest 即可
 * @author anthony
 * @date 2023/4/6
 */
@Slf4j
@SpringBootTest
public class Junit5Test {

    @Autowired
    private UserController userController;

    /**
     * 注意这里的 @Test 注解全路径是：org.junit.jupiter.api.Test
     */
    @Test
    public void insertTest(){
        UserEntity userEntity = UserEntity.builder().username("李白").gmtCreate(LocalDateTime.now()).build();

        String result = userController.insert(userEntity);

        log.info("响应结果为{}", result);
    }
}
