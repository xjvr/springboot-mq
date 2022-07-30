package com.github.xjvr.mq.activemq.queue;


import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.JmsListener;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * @author rjw
 */
@Configuration
public class QueueConsumer {

    @JmsListener(destination = "${myqueue}")
    public void receive(TextMessage textMessage) throws JMSException {
        System.out.println("消费者收到消息："+textMessage.getText());
    }
}
