package com.codeagles.springbooteventdemo.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author codeagles
 * @date 2024/6/20
 * @description 事件监听器（实现ApplicationListener接口方式）
 */
@Component
public class MyCustomEventListener implements ApplicationListener<MyCustomEvent> {

    @Override
    public void onApplicationEvent(MyCustomEvent event) {
        String message = event.getMessage();
        System.out.println("Interface Received custom event - " + message);
        // 这里可以添加更多的处理逻辑
    }
}
