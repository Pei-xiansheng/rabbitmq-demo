package com.zap.rabbitmq.message.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: Apeng
 * @version: 1.0
 * @date: 2022/5/16 10:22
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    //配置swagger的插件
    @Bean
    public Docket webApiConfig(){
        //配置类型
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("GroupOne")//配置组的名称
                .apiInfo(webApiInfo())//配置api的基本信息
                .select()
//                .paths(Predicates.not(PathSelectors.regex("/admin/.*")))
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .build();
    }
    private ApiInfo webApiInfo(){
        return new ApiInfoBuilder()
                .title("RabbitMq的简单示例")//
                .description("简单Demo")
                .version("1.0")
                .contact(new Contact("Evan", "localhost：8080", "1641984918@qq.com"))
                .build();
    }
}
