package com.zap.rabbitmq.message.dao;

import com.zap.rabbitmq.message.entity.Info;
import com.zap.rabbitmq.message.entity.InfoMsgVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: ZhuApeng
 * @Title: RabbitMqMapper
 * @ProjectName: rabbitmq-demo
 * @Description:
 * @date: 2021/12/12 20:44
 */
@Mapper
public interface RabbitMqMapper {

    int sendToDb(Info info);

    boolean sendMsgToDb(@Param("vo") InfoMsgVo vo, @Param("msgStr") String msgStr);

}
