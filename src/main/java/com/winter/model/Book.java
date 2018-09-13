package com.winter.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
//@Data : 自动生成set/get方法，toString方法，equals方法，hashCode方法，不带参数的构造方法
//注意：lombok 的注解不能被继承。
//1、在 Bean / Entity 类上使用 @Data 注解。
//2、需要使用 Log 对象的地方使用 @Log4j（依项目日志框架决定）。
public class Book {
	
    @ApiModelProperty("名字")
    private String name;
    
    @ApiModelProperty("价格")
    private String price;
    
    @ApiModelProperty("关联id")
    private Long id;
    
 }
