package com.zap.rabbitmq.message.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Employee
 * @Author Evan
 * @Descrption
 * @create 2022/8/23 14:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    //不建议 index 和 name 同时用，要么一个对象只用index，要么一个对象只用name去匹配
    //强制读取第1个

    private Integer eid;

    //用名字去匹配，这里需要注意，如果名字重复，会导致只有一个字段读取到数据

    private String ename;



    private String esex;


    private Integer eage;


    private Double esalary;

    //省略 get、set、构造 方法
}
