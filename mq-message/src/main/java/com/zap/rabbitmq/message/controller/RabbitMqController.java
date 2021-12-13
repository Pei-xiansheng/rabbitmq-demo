package com.zap.rabbitmq.message.controller;

import com.zap.rabbitmq.message.commonutils.Result;
import com.zap.rabbitmq.message.entity.Info;
import com.zap.rabbitmq.message.service.RabbitMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: ZhuApeng
 * @Title: RabbitMqController
 * @ProjectName: rabbitmq-demo
 * @Description:
 * @date: 2021/12/12 20:10
 */

@RestController
@RequestMapping("/mq")
public class RabbitMqController {

    @Autowired
    RabbitMqService rabbitMqService;

    @PostMapping("/dealMessage")
    public Result dealMessage(@RequestBody Info info){
        boolean flag = rabbitMqService.dealMessage(info);
        if(flag){
            return Result.ok().message("已经成功预定！");
        }else {
            return Result.error().message("未成功预定！");
        }
    }
}
