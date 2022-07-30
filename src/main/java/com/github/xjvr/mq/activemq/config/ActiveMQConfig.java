package com.github.xjvr.mq.activemq.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;
import javax.jms.Topic;


/**
 * @author rjw
 */
@Configuration
@EnableJms
public class ActiveMQConfig {

    @Value("${myqueue}")
    private String myqueue;

    @Value("${mytopic}")
    private String mytopic;

    @Bean
    public Queue queue() {
        return new ActiveMQQueue(myqueue);
    }

    @Bean
    public Topic topic(){
        return new ActiveMQTopic(mytopic);
    }

}
