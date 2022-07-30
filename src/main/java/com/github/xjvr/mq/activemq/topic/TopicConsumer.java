package com.github.xjvr.mq.activemq.topic;


import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.JmsListener;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * @author rjw
 */
@Configuration
public class TopicConsumer {

    @JmsListener(destination = "${mytopic}")
    public void receive(TextMessage textMessage) throws JMSException {
        System.out.println("消费者收到消息："+textMessage.getText());
    }
}
