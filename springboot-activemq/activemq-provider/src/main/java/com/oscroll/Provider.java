package com.oscroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;


@Component
public class Provider implements ApplicationRunner {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Override
    public void run(ApplicationArguments args) {
        while (true) {
            jmsMessagingTemplate.convertAndSend("my_msg", "发送");
        }

    }

}