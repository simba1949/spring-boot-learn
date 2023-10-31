package vip.openpark.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.time.Duration;

/**
 * <div>
 *     Listener 先要从 META-INF/spring.factories 读到
 *     1.引导：利用 DefaultBootstrapContext 引导整个项目的启用
 *          starting：             应用开始，SpringApplication.run() 一调用，只要有了 DefaultBootstrapContext 就执行；
 *          environmentPrepared：  环境准备好（把启动参数等绑定到环境变量中），但是 IOC 容器还没有创建；
 *     2.启动
 *          contextPrepared：      IOC容器创建并准备好，但是 sources（主配置类）没有加载。并关闭了 DefaultBootstrapContext；
 *          contextLoaded：        IOC容器加载。主配置类加载进 IOC 容器里面。但是 IOC 容器还没有刷新（Bean没有创建）
 *          ==================截止之前，IOC容器里面还没有造Bean============================================
 *          started：              IOC 容器刷新了（所有的bean造好了），但是 command-line runners 没有执行
 *          ready：                IOC 容器刷新了（所有的bean造好了），command-line runners 都执行了
 *     3.运行
 * </div>
 *
 * @author anthony
 * @version 2023/10/31 20:52
 */
@Slf4j
public class MySpringApplicationRunListener implements SpringApplicationRunListener {

    @Override
    public void starting(ConfigurableBootstrapContext bootstrapContext) {
        // 这里执行了，但是没有打印日志
        log.info("starting 应用程序正在启动");
    }

    @Override
    public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext, ConfigurableEnvironment environment) {
        log.info("environmentPrepared spring环境准备完成");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        log.info("contextPrepared spring容器准备完成");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        log.info("contextLoaded spring容器bean加载完成");
    }

    @Override
    public void started(ConfigurableApplicationContext context, Duration timeTaken) {
        log.info("started 应用程序启动完成");
    }

    @Override
    public void ready(ConfigurableApplicationContext context, Duration timeTaken) {
        log.info("ready 应用程序准备就绪");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        log.info("failed 应用程序启动失败");
    }
}