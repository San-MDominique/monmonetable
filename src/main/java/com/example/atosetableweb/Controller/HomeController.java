package com.example.atosetableweb.Controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashbord")
@RequiredArgsConstructor
public class HomeController {
    public String showDahboardPage(HttpServletRequest request, Model model) {

        String currentUrl = request.getRequestURI();
        model.addAttribute("currentUrl", currentUrl);
        return "home/dashbord";
    }
}
