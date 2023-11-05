package vip.openpark.cache.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;
import vip.openpark.cache.domain.User;

import java.util.HashMap;
import java.util.Map;

/**
 * 这里假设查询数据库
 *
 * @author anthony
 * @version 2023/11/5 15:00
 */
@Slf4j
@Repository
public class UserRepository {

    private Map<Long, User> DB_MAP = new HashMap<>() {{
        put(1L, User.builder().id(1L).username("李白").build());
        put(2L, User.builder().id(2L).username("杜甫").build());
    }};

    public User get(long id) {
        log.info("通过数据库查询");
        return DB_MAP.get(id);
    }

    public void update(User user) {
        User userByDB = DB_MAP.get(user.getId());
        Assert.notNull(userByDB, "查询不到数据");

        DB_MAP.put(user.getId(), user);
    }
}