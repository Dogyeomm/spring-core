package com.codeit.springcore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 컨트롤러 역할 빈을 등록하겠다. Component랑 똑같은데, 이름으로 역할 구분하려고.
public class HomeController {

    @GetMapping("/hello")
    @ResponseBody // home.html 말고 home이라는 문자 갖다 박으려고 붙인 거임
    public String home() {
        System.out.println("서버에 요청이 들어왔음!");
        return "home";
    }
}