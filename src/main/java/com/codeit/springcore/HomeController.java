package com.codeit.springcore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    public HomeController() {
        System.out.println("HomeController 생성됨, 내가 생성한 것 아님!");
    }

    @GetMapping("/hello")
    public String home() {
        System.out.println("서버에 요청이 들어왔음!");
        return "home";
    }
}
