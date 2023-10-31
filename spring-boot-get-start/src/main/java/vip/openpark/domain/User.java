package vip.openpark.domain;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author anthony
 * @version 2023/4/4
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -3064936650154013381L;

    private String username;

    private LocalDateTime birthday;
}