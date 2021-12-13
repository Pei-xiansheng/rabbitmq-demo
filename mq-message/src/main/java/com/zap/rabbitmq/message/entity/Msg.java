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
    private String message;
    private Boolean flag;
    private Integer messageId;
    private Integer uId;
}
