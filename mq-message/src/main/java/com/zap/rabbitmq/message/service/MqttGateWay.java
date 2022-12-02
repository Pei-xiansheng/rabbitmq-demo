package com.zap.rabbitmq.message.service;
import org.springframework.messaging.handler.annotation.Header;

/**
 * @ClassName MqttGateWay
 * @Author Evan
 * @Descrption
 * @create 2022/11/10 16:40
 */
//@MessagingGateway(defaultRequestChannel = "mqttOutboundChannel")
//public interface MqttGateWay {
//    // 定义重载方法，用于消息发送
//    void sendToMqtt(String payload);
//
//    // 指定topic进行消息发送
//    void sendToMqtt(@Header(MqttHeaders.TOPIC) String topic, String payload);
//    void sendToMqtt(@Header(MqttHeaders.TOPIC) String topic, @Header(MqttHeaders.QOS) int qos, String payload);
//}
