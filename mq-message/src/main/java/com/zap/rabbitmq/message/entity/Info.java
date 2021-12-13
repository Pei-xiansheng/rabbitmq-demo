package com.zap.rabbitmq.message.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: ZhuApeng
 * @Title: Info
 * @ProjectName: rabbitmq-demo
 * @Description:
 * @date: 2021/12/12 20:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Info {

    private Integer id;
    private Integer term;
    private Integer uId;
    private Boolean isReturn;
}
