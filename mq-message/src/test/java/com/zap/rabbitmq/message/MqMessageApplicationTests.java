package com.zap.rabbitmq.message;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootTest
class MqMessageApplicationTests {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void contextLoads() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.selectList("");
    }

    @Test
    void calNumber(){
        LocalDateTime localDateTime = LocalDateTime.of(2022, 11, 26, 0, 0, 0);
        System.out.println(LocalDateTime.now().until(localDateTime, ChronoUnit.DAYS));
    }

}
