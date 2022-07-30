package com.github.xjvr.mq.ctrl;

import com.github.xjvr.mq.activemq.queue.QueueProduce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rjw
 */
@RestController
@EnableScheduling // 增加定时支持
public class ActiveMQController {

    @Autowired
    private QueueProduce queueProduce;

    @RequestMapping("/queue/produce")
    public void queue_send() {
        queueProduce.produceMsg();
        System.out.printf("'消息发送成功");
    }

}
