package com.winter.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.winter.filter.HTTPBasicAuthorizeFilter;

@Configuration
public class FilterConfig {
	
	@Bean  
    public FilterRegistrationBean  filterRegistrationBean2() {  
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();  
        HTTPBasicAuthorizeFilter httpBasicFilter = new HTTPBasicAuthorizeFilter();  
        registrationBean.setFilter(httpBasicFilter);  
        List<String> urlPatterns = new ArrayList<String>(1);  
        urlPatterns.add("/*");  
        registrationBean.setUrlPatterns(urlPatterns);  
        return registrationBean;  
    }
	
}
