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
 * ������ʵ��SpringMVC
 * @author ��쿻�
 *
 */
@Configuration//������ǰ����һ�������࣬�������xml�����ļ�
@EnableWebMvc//
@EnableScheduling
@ComponentScan("com.weihui.summer.springboot")
@EnableAspectJAutoProxy
public class BaseConfig {
	
	@Bean//�����˷����ķ���ֵ��һ��bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/pages/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setViewClass(JstlView.class);
		//������JSPҳ����ͨ��${}����beans
		viewResolver.setExposeContextBeansAsAttributes(true);
		return viewResolver;
	}
	
}
