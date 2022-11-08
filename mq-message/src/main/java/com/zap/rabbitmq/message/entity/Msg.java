package com.zap.rabbitmq.message.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: ZhuApeng
 * @Title: Msg
 * @ProjectName: rabbitmq-demo
 * @Description:
 * @date: 2021/12/12 20:28
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Msg {
    private Integer id;
    //消息体
    private String message;
    //是否发送成功
    private Boolean flag;
    //消息ID
    private Integer messageId;
    //用户ID
    private Integer uId;
}
