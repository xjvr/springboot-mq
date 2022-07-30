package com.github.xjvr.mq.activemq.queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

@Component
public class QueueProduce {

    @Autowired
    private JmsMessagingTemplate template;

    @Autowired
    private Queue queue;

    public void produceMsg(){
        template.convertAndSend(queue,"produceMsg");
    }

    /**
     * 带定时功能的，每三秒发送一条
     */
    @Scheduled(fixedDelay = 3000)
    public void produceMsgScheduled(){
        template.convertAndSend(queue,"produceMsgScheduled");
        System.out.println("系统定时投递 produceMsgScheduled");
    }

}
