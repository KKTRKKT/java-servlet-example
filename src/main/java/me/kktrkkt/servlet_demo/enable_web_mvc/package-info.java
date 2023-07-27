package me.kktrkkt.servlet_demo.enable_web_mvc;

/*
@EnableWebMvc는 스프링 프레임워크에서 제공하는 MVC 설정 관련 애노테이션입니다
DispatcherServlet에 사용할 빈을 일부 등록해줍니다. (Intercepter, Adapater, Converter 등)

@EnableWebMvc를 설정하지 않으면 빈들을 일일히 생성하거나, 주입을 받아서 설정을 변경해줬지만,
WebMvcConfigure와 같이 사용하면서 설정을 추가하고, 변경하는일이 더 편해졌다.
 */