package com.codeagles.springbooteventdemo.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @author codeagles
 * @date 2024/6/20
 * @description 自定义事件类
 */
@Getter
public class MyCustomEvent extends ApplicationEvent {

    private final String message;

    public MyCustomEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

}
