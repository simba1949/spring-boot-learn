package vip.openpark.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import vip.openpark.test.domain.UserEntity;

/**
 * @author anthony
 * @version 2023/11/2 9:51
 */
@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerRunServerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void exec(){
        ResponseEntity<UserEntity> responseEntity = testRestTemplate.getForEntity("/user", UserEntity.class);
        Assertions.assertTrue(responseEntity.hasBody(), "响应体为空");

        UserEntity userEntity = responseEntity.getBody();
        log.info("响应数据是：{}", userEntity);
    }
}