package me.kktrkkt.servlet_demo.dispatcher_servlet;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getName(){
        return "kktrkkt";
    }
}
