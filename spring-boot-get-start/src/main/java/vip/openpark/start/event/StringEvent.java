package vip.openpark.start.event;

import org.springframework.context.ApplicationEvent;

import java.io.Serial;

/**
 * @author anthony
 * @version 2023/10/31 22:24
 */
public class StringEvent extends ApplicationEvent {
    @Serial
    private static final long serialVersionUID = -1378734779102491671L;

    private String payload;

    /**
     * @param source 事件源信息
     */
    public StringEvent(String source) {
        super(source);
    }
}