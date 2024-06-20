package com.codeagles.springbooteventdemo.event;

import com.codeagles.springbooteventdemo.event.common.MyCustomCommonEvent;
import lombok.SneakyThrows;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author codeagles
 * @date 2024/6/20
 * @description 事件监听器（注解方式）
 */
@Component
@Order(1)
public class MyCustomEventAnnotationListener {

    @SneakyThrows
    @Async
    @EventListener
    public void handleEvent(MyCustomEvent event) {
        String message = event.getMessage();
        System.out.println("Annotation Received custom event - " + message + " threadName: " + Thread.currentThread().getName());
        // 这里可以添加更多的处理逻辑
    }
}
