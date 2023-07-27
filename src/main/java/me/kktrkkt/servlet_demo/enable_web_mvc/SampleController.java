package me.kktrkkt.servlet_demo.enable_web_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("/sample")
    public void samplePage() {
    }
}
