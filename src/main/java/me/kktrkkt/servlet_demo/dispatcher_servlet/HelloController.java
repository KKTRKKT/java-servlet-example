package me.kktrkkt.servlet_demo.dispatcher_servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello, " + helloService.getName();
    }

    @GetMapping("/sample")
    public String sample(){
        // viewResolver가 ModelAndView에 담아서 리턴해준다
        return "/WEB-INF/templates/sample.jsp";
    }
}
