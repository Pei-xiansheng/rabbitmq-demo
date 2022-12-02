package com.zap.rabbitmq.message.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName MqttController
 * @Author Evan
 * @Descrption
 * @create 2022/11/10 16:41
 */
@Slf4j
@RestController
@RequestMapping("/mqqtApi")
public class MqttController {

//    @Resource
//    MqttGateWay mqttGateWay;
//
//    @PostMapping("/publish")
//    public String publish(@RequestHeader(value = "toplic") String toplic , String message) {
//        log.info(String.format("topic: %s, message: %s", toplic, message));
//        mqttGateWay.sendToMqtt(toplic, message);
//        return "success";
//    }
}
