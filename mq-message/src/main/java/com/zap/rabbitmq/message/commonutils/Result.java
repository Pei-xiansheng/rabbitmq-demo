package com.zap.rabbitmq.message.commonutils;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: ZhuApeng
 * @Title: Rsult
 * @ProjectName: rabbitmq-demo
 * @Description:
 * @date: 2021/12/12 20:12
 */
@Data
public class Result {

    private Integer code;
    private String message;
    private Boolean isSuccess;
    private Map<String,Object> map= new HashMap<String,Object>();

    public static Result ok(){
        Result r = new Result();
        r.setCode(ResultStatus.SUCCESS_CODE);
        r.setIsSuccess(true);
        r.setMessage("成功！");
        return r;
    }

    public static Result error(){
        Result r = new Result();
        r.setCode(ResultStatus.FAIL_CODE);
        r.setIsSuccess(false);
        r.setMessage("失败！");
        return r;
    }

    public Result success(Boolean success){
        this.setIsSuccess(success);
        return this;
    }

    public Result code(Integer code){
        this.setCode(code);
        return this;
    }

    public Result message(String message){
        this.setMessage(message);
        return this;
    }

    public Result map(Map map){
        this.setMap(map);
        return this;
    }

    public Result data(String key,Object value){
        this.map.put(key,value);
        return this;
    }

}
