package com.zap.rabbitmq.message.commonutils;

/**
 * @author: ZhuApeng
 * @Title: RabbitMqStatus
 * @ProjectName: rabbitmq-demo
 * @Description:
 * @date: 2021/12/12 21:12
 */

public interface RabbitMqStatus {
    //处理消息交换机
    String DELAY_EXCHANGE ="dealMessage_Exchange";
    //处理队列的交换机
    String DELAY_QUEUE = "dealMessage_Queue";
    //路由
    String DELAY_ROUTING_KEY ="dealMessage_Routing_Key";
    //超时时间
    Integer DELAY_TIME=1;

}
