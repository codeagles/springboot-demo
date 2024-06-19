package com.codeagles.springbooteventdemo;

import com.codeagles.springbooteventdemo.event.common.EventCommonPublisher;
import com.codeagles.springbooteventdemo.event.EventPublisher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootEventDemoApplicationTests {

    @Autowired
    private EventPublisher eventPublisher;
    @Autowired
    private EventCommonPublisher eventCommonPublisher;

    @Test
    void contextLoads() {
        eventPublisher.publishEvent("Hello！This is a event!");
    }

}
