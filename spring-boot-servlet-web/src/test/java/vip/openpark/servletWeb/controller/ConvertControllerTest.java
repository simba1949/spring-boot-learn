package vip.openpark.servletWeb.controller;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

/**
 * @author anthony
 * @version 2023/11/2 14:13
 */
@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ConvertControllerTest {

    @Resource
    private TestRestTemplate testRestTemplate;

    @Test
    public void get() {
        ResponseEntity<String> response = testRestTemplate.getForEntity("/convert?target=2023-11-01 08:08:08", String.class);
        Assertions.assertTrue(response.hasBody());

        log.info("响应数据是：{}", response.getBody());
    }
}