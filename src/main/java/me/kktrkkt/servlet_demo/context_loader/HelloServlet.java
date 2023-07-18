package me.kktrkkt.servlet_demo.context_loader;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ApplicationContext context = (ApplicationContext) getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        HelloService helloService = context.getBean(HelloService.class);

        System.out.println("doGet");
        resp.getWriter().println("<html>");
        resp.getWriter().println("<head></head>");
        resp.getWriter().println("<body>");
        resp.getWriter().println("<h1>" + helloService.getName() + "</h1>");
        resp.getWriter().println("</body>");
        resp.getWriter().println("</html>");
    }

}
