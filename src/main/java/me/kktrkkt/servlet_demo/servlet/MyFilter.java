package me.kktrkkt.servlet_demo.servlet;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 서블릿 컨텍스트가 초기화된 후 초기화 된다.
        System.out.println("Filter Init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // doGet으로 가기전에 호출된다
        System.out.println("Filter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // 서블릿 컨텍스트가 종료되기 전에 종료된다.
        System.out.println("Filter Destroy");
    }
}
