package vip.openpark.servletWeb.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anthony
 * @version 2023/11/2 14:10
 */
@Slf4j
@RestController
@RequestMapping("convert")
public class ConvertController {

    @GetMapping
    public String convert(Long target) {
        log.info("获取数据是：{}", target);
        return "SUCCESS";
    }
}