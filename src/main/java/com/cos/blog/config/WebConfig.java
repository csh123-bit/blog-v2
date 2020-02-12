package com.cos.blog.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;

import com.cos.blog.aop.SessionIntercepter;

@Configuration
public class WebConfig implements WebMvcConfigurer{
//web.xml 진입점 부터 만들어준다
	@Value("${file.path}")
	private String fileRealPath;
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
		
		//파일 경로 인식하게 하기
		registry.addResourceHandler("/media/**").addResourceLocations("file://"+fileRealPath).setCachePeriod(3600).resourceChain(true).addResolver(new PathResourceResolver());
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//원래 있는 함수 오버라이드
		System.out.println("인터셉터");
		registry.addInterceptor(new SessionIntercepter())
			.addPathPatterns("/user/profile/**")
			.addPathPatterns("/post/write/**")
			.addPathPatterns("/post/update/**")
			.addPathPatterns("/post/delete/**");
		
			//addExcludePatterns() 제외시킬때 사용!!
		
	}
}
