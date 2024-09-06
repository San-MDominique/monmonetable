package com.example.atosetableweb.Controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class AuthController {

    @GetMapping("/login")
    public String showLoginPage(Model model, HttpServletRequest request){
        System.out.println("test showLoginPage");
        String currentUrl = request.getRequestURI();
        model.addAttribute("currentUrl", currentUrl);
        return "auth/login";
    }
}
