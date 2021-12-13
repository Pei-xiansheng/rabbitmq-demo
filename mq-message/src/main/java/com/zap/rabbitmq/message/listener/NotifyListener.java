package com.zap.rabbitmq.message.listener;

import com.alibaba.fastjson.JSON;
import com.rabbitmq.client.Channel;
import com.zap.rabbitmq.message.commonutils.RabbitMqStatus;
import com.zap.rabbitmq.message.entity.Info;
import com.zap.rabbitmq.message.entity.InfoMsgVo;
import com.zap.rabbitmq.message.service.RabbitMqService;
import jdk.nashorn.internal.runtime.JSONFunctions;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author: ZhuApeng
 * @Title: NotifyListener
 * @ProjectName: rabbitmq-demo
 * @Description:
 * @date: 2021/12/12 21:35
 */
@Component
public class NotifyListener {

    @Autowired
    RabbitMqService rabbitMqService;

    @RabbitListener(queues = RabbitMqStatus.DELAY_QUEUE)
    @RabbitHandler
    public void onMessage(Message message, Channel channel) throws IOException {
        long deliveryTag = message.getMessageProperties().getDeliveryTag();
        try {
            String voStr = new String(message.getBody());
            InfoMsgVo vo = JSON.parseObject(voStr,InfoMsgVo.class);
            boolean flag = rabbitMqService.dealMsgToDb(vo);
            if(!flag){
                System.out.println("数据库未能同步消息成功！");
            }
            channel.basicAck(deliveryTag,false);
            System.out.println("消息已成功应答！");
            Boolean isSucces = message.getMessageProperties().getRedelivered();
            if(isSucces){
                long tag = message.getMessageProperties().getDeliveryTag();
                channel.basicReject(tag,false);
                System.out.println(tag+"编号的消息已经被拒绝多次，不再进行投递！消息将被丢弃，不再放入消息队列中！");
            }
        } catch (IOException e) {
            channel.basicNack(deliveryTag,false,true);
            System.out.println("消息未成功应答！");
        }
    }
}
