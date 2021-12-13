package com.zap.rabbitmq.message.service.impl;

import com.alibaba.fastjson.JSON;
import com.zap.rabbitmq.message.commonutils.RabbitMqStatus;
import com.zap.rabbitmq.message.dao.RabbitMqMapper;
import com.zap.rabbitmq.message.entity.Info;
import com.zap.rabbitmq.message.entity.InfoMsgVo;
import com.zap.rabbitmq.message.service.RabbitMqService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author: ZhuApeng
 * @Title: RabbitMqServiceImpl
 * @ProjectName: rabbitmq-demo
 * @Description:
 * @date: 2021/12/12 20:40
 */

@Service
public class RabbitMqServiceImpl implements RabbitMqService {

    @Autowired
    RabbitMqMapper rabbitMqMapper;

    @Autowired
    RabbitTemplate rabbitTemplate;

    //生产者
    @Override
    public boolean dealMessage(Info info) {
        int messageId = rabbitMqMapper.sendToDb(info);
        String string = UUID.randomUUID().toString().substring(0, 6);
        CorrelationData correlationData = new CorrelationData(string);
        InfoMsgVo vo = new InfoMsgVo(info.getUId(), messageId,info.getTerm());
        String voStr = JSON.toJSONString(vo);
        rabbitTemplate.convertAndSend(RabbitMqStatus.DELAY_EXCHANGE,RabbitMqStatus.DELAY_QUEUE,voStr,(msg)->{
            msg.getMessageProperties().setDelay(RabbitMqStatus.DELAY_TIME*info.getTerm());
            return msg;
        },correlationData);
        if(messageId!=-1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean dealMsgToDb(InfoMsgVo voStr){
        String msgStr = "亲爱的小朋友您好！您所借阅的图书"+voStr.getTerm()+"即将要到期了,记得到期归还哦！";
        boolean flag =rabbitMqMapper.sendMsgToDb(voStr,msgStr);
        if(flag){
            return true;
        }else{
            return false;
        }
    }
}
