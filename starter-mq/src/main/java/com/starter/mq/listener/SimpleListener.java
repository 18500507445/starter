package com.starter.mq.listener;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import cn.hutool.json.JSONUtil;
import com.rabbitmq.client.Channel;
import com.starter.common.constant.MQConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

/**
 * @description: 简单的一个rabbitMQ demo
 * @author: wzh
 * @date: 2023/4/14 09:03
 */
@Component
@Slf4j
public class SimpleListener {

    @RabbitHandler
    @RabbitListener(queuesToDeclare = @Queue(MQConstants.DEMO), concurrency = "1-3", ackMode = "MANUAL")
    public void demo(Map<String, Object> msg, Message message, Channel channel) {
        TimeInterval timer = DateUtil.timer();
        long tag = message.getMessageProperties().getDeliveryTag();
        try {
            log.info("收到消息：{}", JSONUtil.toJsonStr(msg));
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                //手动消费
                channel.basicAck(tag, false);
            } catch (IOException e) {
                log.error("消费异常");
            }
        }
        log.info("耗时:{}ms", timer.interval());
    }
}
