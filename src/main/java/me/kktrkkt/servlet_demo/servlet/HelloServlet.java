package me.kktrkkt.servlet_demo.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
Servlet
- 스프링 MVC의 기반이다
- 요청 당 쓰레드를 생성한다
- 실행하기 위해서는 서블릿 엔진 또는 서블릿 컨테이너가 필요하다
 */
public class HelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        // 첫 요청에만 호출
        System.out.println("init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 매 요청마다 호출
        System.out.println("doGet");
        resp.getWriter().println("<html>");
        resp.getWriter().println("<head></head>");
        resp.getWriter().println("<body>");
        resp.getWriter().println("<h1>" + getName() + "</h1>");
        resp.getWriter().println("</body>");
        resp.getWriter().println("</html>");
    }

    private Object getName() {
        return getServletContext().getAttribute("name");
    }

    @Override
    public void destroy() {
        // servlet 컨테이너 종료 시점에 보통 호출
        System.out.println("destroy");
    }
}
