package me.kktrkkt.servlet_demo.enable_web_mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan
// @EnableWebMvc를 DispatcherServlet을 구성하는 빈들에 영향을 미친다(order, 빈 추가 등)
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

//    @Bean
//    public ViewResolver viewResolver() {
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setPrefix("/WEB-INF/templates/");
//        viewResolver.setSuffix(".jsp");
//        return viewResolver;
//    }


    // @EnableWebMvc와 WebMvcConfigurer를 사용하면 설정 추가를 편하게 할 수 있다
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/templates/", ".jsp");
    }
}
