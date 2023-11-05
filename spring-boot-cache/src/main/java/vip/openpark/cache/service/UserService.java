package vip.openpark.cache.service;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import vip.openpark.cache.domain.User;
import vip.openpark.cache.repository.UserRepository;

/**
 * @author anthony
 * @version 2023/11/5 14:59
 */
@Slf4j
@Service
public class UserService {

    @Resource
    public UserRepository userRepository;

    /**
     * 再次调用会直接走缓存，而不是走 UserService.get 代码
     * 注解 @Cacheable(cacheNames = "user:id", key = "#id")
     *
     * @param id
     * @return
     */
    @Cacheable(cacheNames = "user:id", key = "#id")
    public User get(long id) {
        log.info("去查询数据");
        User user = userRepository.get(id);
        log.info("从数据中获取的数据是：{}", user);
        return user;
    }

    /**
     * 注解 @CachePut 在执行前不会去检查缓存中是否存在之前执行过的结果，
     * 而是每次都会执行该方法，并将执行结果以键值对的形式存入指定的缓存中。
     *
     * @param id
     * @return
     */
    @CachePut(cacheNames = "user:id", key = "#id")
    public User getByCachePut(long id) {
        log.info("去查询数据");
        User user = userRepository.get(id);
        log.info("从数据中获取的数据是：{}", user);
        return user;
    }

    /**
     * <div>
     *     当存在id的数据有更新时，清空 id 对应的缓存数据
     *     注解 @CacheEvict 用来标注在需要清除缓存元素的方法或类上的。
     * </div>
     *
     * @param user
     */
    @CacheEvict(cacheNames = "user:id", key = "#user.id")
    public void update(User user) {
        userRepository.update(user);
    }
}