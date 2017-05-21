package com.weihui.summer.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * 零配置实现SpringMVC
 * @author 张炜辉
 *
 */
@Configuration//声明当前类是一个配置类，用于替代xml配置文件
@EnableWebMvc//
@EnableScheduling
@ComponentScan("com.weihui.summer.springboot")
@EnableAspectJAutoProxy
public class BaseConfig {
	
	@Bean//声明此方法的返回值是一个bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/pages/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setViewClass(JstlView.class);
		//可以在JSP页面中通过${}访问beans
		viewResolver.setExposeContextBeansAsAttributes(true);
		return viewResolver;
	}
	
}
