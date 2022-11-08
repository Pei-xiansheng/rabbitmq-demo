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
    //时间
    private Integer term;
    //用户ID
    private Integer uId;
    //是否归还
    private Boolean isReturn;
}
