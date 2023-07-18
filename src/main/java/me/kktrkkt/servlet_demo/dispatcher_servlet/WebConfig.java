package me.kktrkkt.servlet_demo.dispatcher_servlet;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

// DispathcerServlet의 ApplicationContext에 적용할 설정 파일
@Configuration
@ComponentScan(useDefaultFilters = false, includeFilters = @ComponentScan.Filter(Controller.class)) // @Controller만 빈으로 등록한다
public class WebConfig {
}
