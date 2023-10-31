package com.Abhishek.Serv;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MvcViewConfig implements WebMvcConfigurer{

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/db").setViewName("db");
		registry.addViewController("/add_form").setViewName("add_form");
		registry.addViewController("/update_form").setViewName("update_form");
		registry.addViewController("/update_form").setViewName("update_form");
		registry.addViewController("/db").setViewName("db");
		registry.addViewController("/index").setViewName("index");
		registry.addViewController("/AboutUs").setViewName("AboutUs");
		registry.addViewController("/all_services").setViewName("all_services");
		registry.addViewController("/emergency_services").setViewName("emergency_services");
		registry.addViewController("/team").setViewName("team");	
		registry.addViewController("/branches").setViewName("branches");	
		registry.addViewController("/clients").setViewName("clients");	
		registry.addViewController("/ProductPage").setViewName("ProductPage");	
		registry.addViewController("/CheckoutPage/*").setViewName("CheckoutPage");
		registry.addViewController("/CheckoutPage").setViewName("CheckoutPage");	
	}
	
}
