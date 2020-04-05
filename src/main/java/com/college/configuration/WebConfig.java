package com.college.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig implements WebMvcConfigurer  {
	
@Override
public void configurePathMatch(PathMatchConfigurer configurer) {
	// TODO Auto-generated method stub
	AntPathMatcher matcher = new AntPathMatcher();
	matcher.setCaseSensitive(false);
	configurer.setPathMatcher(matcher);
}


}
