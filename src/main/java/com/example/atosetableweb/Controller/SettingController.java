package com.example.atosetableweb.Controller;

import com.example.atosetableweb.service.AppSettingService;
import com.example.atosetableweb.service.dto.AppSettingDTO;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class SettingController {
    private final AppSettingService appSettingService;

    @GetMapping("/settings")
    public String showAddSettingPage(HttpServletRequest request, Model model){
        String currentUrl = request.getRequestURI();
        model.addAttribute("currentUrl", currentUrl);
        model.addAttribute("setting", new AppSettingDTO());
        return "appSetting/forms";
    }

    @PostMapping("/PostSettings")
    public String saveSetting(AppSettingDTO appSettingDTO){
        appSettingService.save(appSettingDTO);
        return "redirect:/";
    }
}
