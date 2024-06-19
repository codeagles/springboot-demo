package com.codeagles.springbooteventdemo.event.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @author codeagles
 * @date 2024/6/20
 * @description
 */
@Component
public class EventCommonPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishCommonEvent(String message) {
        MyCustomCommonEvent myCustomCommonEvent = new MyCustomCommonEvent(message);
        System.out.println("CommonEvent published: " + message);
        applicationEventPublisher.publishEvent(myCustomCommonEvent);
    }
}
