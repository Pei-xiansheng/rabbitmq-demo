package com.zap.rabbitmq.message.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: ZhuApeng
 * @Title: InfoMsgVo
 * @ProjectName: rabbitmq-demo
 * @Description:
 * @date: 2021/12/13 10:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InfoMsgVo {
    //用户ID
    private Integer uId;
    //消息ID
    private Integer messageId;
    //借阅时间
    private Integer term;
}
