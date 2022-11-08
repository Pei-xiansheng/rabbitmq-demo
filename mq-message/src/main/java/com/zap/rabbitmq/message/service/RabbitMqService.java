package com.zap.rabbitmq.message.service;

import com.zap.rabbitmq.message.entity.Info;
import com.zap.rabbitmq.message.entity.InfoMsgVo;

/**
 * @author: ZhuApeng
 * @Title: RabitmqService
 * @ProjectName: rabbitmq-demo
 * @Description:
 * @date: 2021/12/12 20:09
 */

public interface RabbitMqService {
    //处理预定消息
    boolean dealMessage(Info info);
    //持久化到本地
    boolean dealMsgToDb(InfoMsgVo vo);
}