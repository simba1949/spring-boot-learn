package vip.openpark.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author anthony
 * @version 2023/4/6
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 4525441062446118938L;

    private Long id;
    private String username;
    private LocalDateTime gmtCreate;
}
