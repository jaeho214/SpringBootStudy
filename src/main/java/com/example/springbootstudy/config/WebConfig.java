package com.example.springbootstudy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//@EnableWebMvc를 써주면 mvc 관련 설정을 다 여기서 해주어야 함

public class WebConfig implements WebMvcConfigurer {
    //정적 리소스 관련
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/m/**") // m으로 시작하는 요청이 들어오면
                .addResourceLocations("classpath:/m/") // classpath 기준으로 m 디렉토리 밑에서 제공을 하겠다
                .setCachePeriod(20);
    }

    //CORS 관련 이슈
    //여러 Controller에 설정을 해주려면 이렇게,,,,, controller 마다 해주려면 @CrossOrigin 사용
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*");

    }
}
