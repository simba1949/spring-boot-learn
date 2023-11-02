package vip.openpark.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import vip.openpark.test.domain.UserEntity;

/**
 * @author anthony
 * @version 2023/11/2 10:59
 */
@Slf4j
@SpringBootTest
public class MockBeanByMockitoTest {

    @Test
    public void getTest() {
        // Mock Spring Bean
        UserController userController = Mockito.mock(UserController.class);

        UserEntity mockUser = new UserEntity();
        mockUser.setId(3L);
        mockUser.setUsername("MOCK");

        // 两种方式：当执行 userController.get() 这个方法时，返回 Mock 数据
        // 第一种是：BDD （Behavior Drive Development，行为驱动开发）风格，given + willReturn
        // BDDMockito.given(userController.get()).willReturn(mockUser);
        // 第二种是：Mockito风格，When the x method is called then return y
        Mockito.when(userController.get()).thenReturn(mockUser);

        UserEntity userEntity = userController.get();
        log.info("The user is {}", userEntity);
    }
}