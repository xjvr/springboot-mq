package com.github.xjvr.mq.activemq.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Topic;

@Component
public class TopicProduce {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Topic topic;

    @Scheduled(fixedDelay = 3000)
    public void produceTopic(){
        jmsMessagingTemplate.convertAndSend(topic,"=>produceTopic");
        System.out.println("消息推送完毕");
    }

}
