package com.example.sideMall.controller.loginController;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class LoginController {

    //수정되야함
    @GetMapping("/")
    public String loginPage() {
        return "loginPage";
    }

}
