package com.zap.rabbitmq.message.confirm;


import org.springframework.amqp.core.ReturnedMessage;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author: ZhuApeng
 * @Title: MyMessageConfirm
 * @ProjectName: rabbitmq-demo
 * @Description:
 * @date: 2021/12/13 9:04
 */

@Component
public class MyMessageConfirm implements RabbitTemplate.ConfirmCallback,RabbitTemplate.ReturnsCallback {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @PostConstruct
     public void init(){
         rabbitTemplate.setConfirmCallback(this);
     }

    @Override
    public void confirm(CorrelationData correlationData, boolean b, String s) {
        String id = correlationData!=null?correlationData.getId():"";
        if(b){
            System.out.println("消息已经从交换机发送成功！");
        }else{
            System.out.println("消息未成功从交换机发送，原因是："+s);
        }
    }

    @Override
    public void returnedMessage(ReturnedMessage returnedMessage) {
        System.out.println("回退消息"+new String(returnedMessage.getMessage().getBody())+";回退原因:"+returnedMessage.getReplyText()+returnedMessage);
    }
}
