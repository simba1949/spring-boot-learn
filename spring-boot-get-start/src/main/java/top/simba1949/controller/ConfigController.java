package top.simba1949.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.simba1949.config.ConfigurationConfig;
import top.simba1949.config.ConfigurationPropertiesAndComponentConfig;
import top.simba1949.config.ConfigurationPropertiesAndEnableConfig;
import top.simba1949.config.CustomizePropertiesConfig;

/**
 * @author anthony
 * @date 2023/4/3
 */
@Slf4j
@RestController
@RequestMapping("config")
public class ConfigController {
    @Autowired
    private ConfigurationConfig configurationConfig;
    @Autowired
    private ConfigurationPropertiesAndComponentConfig configurationPropertiesAndComponentConfig;
    @Autowired
    private ConfigurationPropertiesAndEnableConfig configurationPropertiesAndEnableConfig;

    @Autowired
    private CustomizePropertiesConfig customizePropertiesConfig;

    @GetMapping("configurationConfig")
    public String configurationConfig(){
        log.info("ConfigurationConfig 读取数据，随机字符串={}", configurationConfig.getStrVal());
        log.info("ConfigurationConfig 读取数据，随机int={}", configurationConfig.getIntVal());
        log.info("ConfigurationConfig 读取数据，随机long={}", configurationConfig.getLongVal());
        log.info("ConfigurationConfig 读取数据，随机uuid={}", configurationConfig.getUuidVal());
        log.info("ConfigurationConfig 读取数据，随机int，设置最大取值={}", configurationConfig.getLessOrEqualVal());
        log.info("ConfigurationConfig 读取数据，随机int，设置取值范围={}", configurationConfig.getRangeVal());
        return "SUCCESS";
    }

    @GetMapping("configurationPropertiesAndComponentConfig")
    public String configurationPropertiesAndComponentConfig(){
        log.info("ConfigurationPropertiesAndComponentConfig 读取数据，随机字符串={}", configurationPropertiesAndComponentConfig.getStrVal());
        log.info("ConfigurationPropertiesAndComponentConfig 读取数据，随机int={}", configurationPropertiesAndComponentConfig.getIntVal());
        log.info("ConfigurationPropertiesAndComponentConfig 读取数据，随机long={}", configurationPropertiesAndComponentConfig.getLongVal());
        log.info("ConfigurationPropertiesAndComponentConfig 读取数据，随机uuid={}", configurationPropertiesAndComponentConfig.getUuidVal());
        log.info("ConfigurationPropertiesAndComponentConfig 读取数据，随机int，设置最大取值={}", configurationPropertiesAndComponentConfig.getLessOrEqualVal());
        log.info("ConfigurationPropertiesAndComponentConfig 读取数据，随机int，设置取值范围={}", configurationPropertiesAndComponentConfig.getRangeVal());
        return "SUCCESS";
    }

    @GetMapping("configurationPropertiesAndEnableConfig")
    public String configurationPropertiesConfig(){
        log.info("ConfigurationPropertiesAndEnableConfig 读取数据，随机字符串={}", configurationPropertiesAndEnableConfig.getStrVal());
        log.info("ConfigurationPropertiesAndEnableConfig 读取数据，随机int={}", configurationPropertiesAndEnableConfig.getIntVal());
        log.info("ConfigurationPropertiesAndEnableConfig 读取数据，随机long={}", configurationPropertiesAndEnableConfig.getLongVal());
        log.info("ConfigurationPropertiesAndEnableConfig 读取数据，随机uuid={}", configurationPropertiesAndEnableConfig.getUuidVal());
        log.info("ConfigurationPropertiesAndEnableConfig 读取数据，随机int，设置最大取值={}", configurationPropertiesAndEnableConfig.getLessOrEqualVal());
        log.info("ConfigurationPropertiesAndEnableConfig 读取数据，随机int，设置取值范围={}", configurationPropertiesAndEnableConfig.getRangeVal());
        return "SUCCESS";
    }

    @GetMapping("customizeConfig")
    public String customizeConfig(){
        log.info("CustomizePropertiesConfig 读取数据， username={}", customizePropertiesConfig.getUsername());
        log.info("CustomizePropertiesConfig 读取数据， age={}", customizePropertiesConfig.getAge());
        log.info("CustomizePropertiesConfig 读取数据， birthday={}", customizePropertiesConfig.getBirthday());
        log.info("CustomizePropertiesConfig 读取数据， secret={}", customizePropertiesConfig.getSecret());
        return "SUCCESS";
    }

}
