package me.kktrkkt.servlet_demo.ioc_container;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getName(){
        return "kktrkkt";
    }
}
