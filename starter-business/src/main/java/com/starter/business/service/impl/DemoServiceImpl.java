package com.starter.business.service.impl;

import com.starter.business.mapper.DemoMapper;
import com.starter.business.service.DemoService;
import com.starter.common.constant.MQConstants;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: wzh
 * @date: 2023/4/14 09:13
 */
@Service
@RequiredArgsConstructor
public class DemoServiceImpl implements DemoService {

    private final DemoMapper demoMapper;

    private final RabbitTemplate rabbitTemplate;

    @Override
    public void add() {
        demoMapper.add();
    }

    @Override
    public void sendMsg() {
        Map<String, Object> message = new HashMap<>(16);
        message.put("id", "1");
        message.put("name", "wzh");
        rabbitTemplate.convertAndSend(MQConstants.DEMO, message);
    }
}
