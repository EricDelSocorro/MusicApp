package com.musicgroup.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.resource.PathResourceResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.musicgroup")   // <- component scan is annotation
public class MusicServletConfig extends WebMvcConfigurerAdapter {
	
	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver irvr = new InternalResourceViewResolver();
		irvr.setViewClass(JstlView.class);
		irvr.setPrefix("/WEB-INF/pages/");
		irvr.setSuffix(".jsp");
		return irvr;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry
			.addResourceHandler("/resources/**")
			.addResourceLocations("/resources/", "/resources/product_image/", "resources/css")
			.setCachePeriod(3600)
			.resourceChain(true)
			.addResolver(new PathResourceResolver());
	}
	
}