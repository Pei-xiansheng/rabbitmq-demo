package com.zap.rabbitmq.message.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: ZhuApeng
 * @Title: User
 * @ProjectName: rabbitmq-demo
 * @Description:
 * @date: 2021/12/12 20:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    private String userName;
    private String passWord;
    private String avatar;
}
