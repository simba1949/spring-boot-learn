package vip.openpark.cache.service;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import vip.openpark.cache.domain.User;

/**
 * @author anthony
 * @version 2023/11/5 15:08
 */
@Slf4j
@SpringBootTest
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void getTest() {
        User user1 = userService.get(1L);
        log.info("进入第1次请求，请求结果是：{}", user1);

        User user2 = userService.get(1L);
        log.info("进入第2次请求，请求结果是：{}", user2);
    }

    @Test
    public void cacheTestWithUpdate() {
        User user1 = userService.get(1L);
        log.info("进入第1次请求，请求结果是：{}", user1);

        User user2 = userService.get(1L);
        log.info("进入第2次请求，请求结果是：{}", user2);

        //----------更新数据 开始------------
        user2.setUsername("李白2");
        userService.update(user2);
        //----------更新数据 结束------------

        User user3 = userService.get(1L);
        log.info("进入第3次请求，请求结果是：{}", user3);

        User user4 = userService.get(1L);
        log.info("进入第4次请求，请求结果是：{}", user4);
    }

    @Test
    public void getByCachePutTest() {
        User user1 = userService.getByCachePut(1L);
        log.info("进入第1次请求，请求结果是：{}", user1);

        User user2 = userService.getByCachePut(1L);
        log.info("进入第2次请求，请求结果是：{}", user2);
    }
}