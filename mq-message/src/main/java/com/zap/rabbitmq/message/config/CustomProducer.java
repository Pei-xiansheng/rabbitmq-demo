package com.zap.rabbitmq.message.config;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;

import java.util.Properties;

/**
 * @ClassName CustomProducer
 * @Author Evan
 * @Descrption kafka 生产者
 * @create 2022/12/23 16:23
 */
public class CustomProducer {

    public static void main(String[] args) {
        //配置
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,)

        //配置生产者
        KafkaProducer<String, String> kafkaProducer = new KafkaProducer<String, String>();

    }
}
