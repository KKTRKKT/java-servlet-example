package me.kktrkkt.servlet_demo.ioc_container;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// web.xml에서 Application Context의 설정파일로 지정했다
// @ComponentScan을 붙여서 AppConfig 위치의 패키지부터 하위 모든 패키지를 스캔해 빈을 등록한다
@Configuration
@ComponentScan
public class AppConfig {
}
