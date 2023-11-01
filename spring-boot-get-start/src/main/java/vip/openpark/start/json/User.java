package vip.openpark.start.json;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author anthony
 * @version 2023/11/1 14:37
 */
@Data
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = -8633350358868724032L;

    private String username;
    private String password;
    private LocalDateTime birthday;
    private BigDecimal price;
}