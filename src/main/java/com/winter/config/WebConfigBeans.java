package com.winter.config;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import com.winter.utils.StringToDateConverter;

@Configuration
public class WebConfigBeans {

	//使用springboot框架对日期类型进行操作，遇到无法保持的情况，一开始报400的错误（解决方法）
	//，解决之后日期类型无法保存到数据库，为了解决这个问题，设置了个全局date转换器。
    @Autowired
    private RequestMappingHandlerAdapter handlerAdapter;

    /**
     * 增加字符串转日期的功能
     */

    @PostConstruct
    public void initEditableAvlidation() {

        ConfigurableWebBindingInitializer initializer = (ConfigurableWebBindingInitializer)handlerAdapter.getWebBindingInitializer();
        if(initializer.getConversionService()!=null) {
            GenericConversionService genericConversionService = (GenericConversionService)initializer.getConversionService();           

            genericConversionService.addConverter(new StringToDateConverter());

        }

    }

}