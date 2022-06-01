package com.zap.rabbitmq.message.config;

import com.zap.rabbitmq.message.commonutils.RabbitMqStatus;
import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

/**
 * @author: ZhuApeng
 * @Title: RabbitMqDealConfig
 * @ProjectName: rabbitmq-demo
 * @Description:
 * @date: 2021/12/12 20:48
 */

@Configuration
public class RabbitMqDealConfig {


    @Bean
    public CustomExchange customExchange(){
        HashMap<String, Object> arguments = new HashMap<>();
        arguments.put("x-delayed-type","direct");
        return new CustomExchange(RabbitMqStatus.DELAY_EXCHANGE,"x-delayed-message",true,false,arguments);
    }

    @Bean
    public Queue queue(){
        return QueueBuilder.durable(RabbitMqStatus.DELAY_QUEUE).build();
    }

    @Bean
    public Binding binding(@Qualifier("customExchange")CustomExchange customExchange,@Qualifier("queue")Queue queue){
        return BindingBuilder.bind(queue).to(customExchange).with(RabbitMqStatus.DELAY_ROUTING_KEY).noargs();
    }

}
