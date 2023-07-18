package me.kktrkkt.servlet_demo.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/*
Servlet Listener
- 웹앱에서 발생하는 주요 이벤트을 감지하고, 추가 작업을 진행할 수 있다
- 주요 이벤트로는 크게 서블릿 컨텍스트, 세션 이벤트가 있다.
    - 각 주요 이벤트에는 라이프사이클, 애트리뷰트 변경 이벤트가 있다.
 */
public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // 서블릿 컨텍스트가 초기화될때 한번 실행된다
        System.out.println("Context Initialized");
        sce.getServletContext().setAttribute("name", "kktrkkt");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // 서블릿 컨텍스트 종료시점에 실행된다
        System.out.println("Context Destroyed");
    }
}
