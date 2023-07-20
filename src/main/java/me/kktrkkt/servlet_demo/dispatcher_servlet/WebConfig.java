package me.kktrkkt.servlet_demo.dispatcher_servlet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

// DispathcerServlet의 ApplicationContext에 적용할 설정 파일
@Configuration
@ComponentScan(useDefaultFilters = false, includeFilters = @ComponentScan.Filter(Controller.class)) // @Controller만 빈으로 등록한다
public class WebConfig {

    // dispatcher servlet에서 Application Context에 등록된 ViewResolver를 가져다 사용하고, 더 이상 기본  뷰리졸버를 사용하지 않는다.
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
