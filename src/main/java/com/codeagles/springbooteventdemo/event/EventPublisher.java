package com.codeagles.springbooteventdemo.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @author codeagles
 * @date 2024/6/20
 * @description
 */
@Component
public class EventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishEvent(String message) {
        MyCustomEvent myCustomEvent = new MyCustomEvent(this, message);
        System.out.println("Event published: " + message);
        applicationEventPublisher.publishEvent(myCustomEvent);
    }
}
