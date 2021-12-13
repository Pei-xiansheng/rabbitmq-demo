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
    private Integer uId;
    private Integer messageId;
    private Integer term;
}
