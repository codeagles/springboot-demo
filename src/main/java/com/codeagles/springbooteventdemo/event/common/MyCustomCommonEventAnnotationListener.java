package com.codeagles.springbooteventdemo.event.common;

import com.codeagles.springbooteventdemo.event.MyCustomEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author codeagles
 * @date 2024/6/20
 * @description 事件监听器（注解方式）
 */
@Component
public class MyCustomCommonEventAnnotationListener {

    @EventListener
    public void handleCommonEvent(MyCustomCommonEvent event) {
        String message = event.getMessage();
        System.out.println("Annotation Received custom common event - " + message);
        // 这里可以添加更多的处理逻辑
    }
}
