package vip.openpark.test.controller;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import vip.openpark.test.domain.UserEntity;

/**
 * @author anthony
 * @version 2023/11/1 17:09
 */
@Slf4j
@WebMvcTest(controllers = UserController.class) // @WebMvcTest 包含了 @SpringBootTest 所包含的所有的注解配置类
public class UserControllerWebMvcTest {

    /**
     * 注解 @WebMvcTest 包含 @AutoConfigureMockMvc， 启动配置 MockMvc 环境，可以直接注入
     */
    @Resource
    private MockMvc mockMvc;

    @MockBean
    private UserController userControllerMock;

    @Test
    public void getMockTest() {
        UserEntity mockUser = new UserEntity();
        mockUser.setId(1L);
        mockUser.setUsername("李白");

        // 两种方式：当执行 userController.get() 这个方法时，返回 Mock 数据
        // 第一种是：BDD （Behavior Drive Development，行为驱动开发）风格，given + willReturn
        BDDMockito.given(userControllerMock.get()).willReturn(mockUser);
        UserEntity user1 = userControllerMock.get();
        log.info("The user is {}", user1);

        // 第二种是：Mockito风格，When the x method is called then return y
        Mockito.when(userControllerMock.get()).thenReturn(mockUser);
        UserEntity user2 = userControllerMock.get();
        log.info("The user is {}", user2);
    }

    /**
     * 发送 GET 请求测试
     *
     * @throws Exception
     */
    @Test
    public void getTest() throws Exception {
        UserEntity mockUser = new UserEntity();
        mockUser.setId(1L);
        mockUser.setUsername("李白");
        BDDMockito.given(userControllerMock.get()).willReturn(mockUser);

        // 构建请求
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
                // 创建一个 POST 请求
                .get("/user")
                // 添加请求头
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                // 期望接收的类型是JSON
                .accept(MediaType.APPLICATION_JSON_VALUE);

        // 发送请求
        ResultActions requestAction = mockMvc.perform(requestBuilder);

        // 执行期望
        requestAction
                .andExpect(MockMvcResultMatchers.status().isOk())
                // 期望值值是一个 JSON
                // jsonPath 参考 https://github.com/json-path/JsonPath
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1L));
    }
}