package vip.openpark.test.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import vip.openpark.test.domain.UserEntity;

import java.time.LocalDateTime;

/**
 * 注解 @AutoConfigureMockMvc 不启动服务器，使用MockMvc发起请求，然后执行相应的代码
 * @author anthony
 * @version 2023/11/1 16:41
 */
@Slf4j
@SpringBootTest
@AutoConfigureMockMvc // 应用于测试类，启用和配置MockMvc的自动配置
public class UserControllerAutoConfigureMockMvcTest {

    /**
     * 注解 @AutoConfigureMockMvc 自动配置 MockMvc 环境，可以直接注入
     */
    @Resource
    private MockMvc mockMvc;

    /**
     * 发送 GET 请求测试
     *
     * @throws Exception
     */
    @Test
    public void getTest() throws Exception {
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
                .andExpect(MockMvcResultMatchers.jsonPath("$.username").value("李白"));
    }

    /**
     * 发送 POST 请求测试
     *
     * @throws Exception
     */
    @Test
    public void addTest() throws Exception {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(2L);
        userEntity.setUsername("李白");
        userEntity.setGmtCreate(LocalDateTime.now());

        // 序列化成 JSON
        String userJson = new ObjectMapper()
                // 在序列化时忽略值为 null 的属性
                .setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .writeValueAsString(userEntity);

        // 构建请求
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
                // 创建一个 POST 请求
                .post("/user")
                // 添加请求头
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                // 期望接收的类型是JSON
                .accept(MediaType.APPLICATION_JSON_VALUE)
                // 添加请求参数
                .content(userJson);

        // 发送请求
        ResultActions requestAction = mockMvc.perform(requestBuilder);

        // 执行期望
        requestAction
                .andExpect(MockMvcResultMatchers.status().isOk())
                // 期望值是一个字符串
                .andExpect(MockMvcResultMatchers.content().string("SUCCESS"));
    }
}