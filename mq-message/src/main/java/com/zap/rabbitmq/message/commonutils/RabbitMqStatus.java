package com.zap.rabbitmq.message.commonutils;

/**
 * @author: ZhuApeng
 * @Title: RabbitMqStatus
 * @ProjectName: rabbitmq-demo
 * @Description:
 * @date: 2021/12/12 21:12
 */

public interface RabbitMqStatus {
    String DELAY_EXCHANGE ="dealMessage_Exchange";
    String DELAY_QUEUE = "dealMessage_Queue";
    String DELAY_ROUTING_KEY ="dealMessage_Routing_Key";
    Integer DELAY_TIME=24*60*60*1000;

}
