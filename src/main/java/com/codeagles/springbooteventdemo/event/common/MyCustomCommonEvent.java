package com.codeagles.springbooteventdemo.event.common;

import lombok.Getter;

/**
 * @author codeagles
 * @date 2024/6/20
 * @description 自定义事件类
 */
@Getter
public class MyCustomCommonEvent{

    private String message;

    public MyCustomCommonEvent(String message) {
        this.message = message;
    }

}
