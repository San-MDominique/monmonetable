package com.example.atosetableweb.Controller;


import com.example.atosetableweb.service.AppSettingService;
import com.example.atosetableweb.service.SchoolService;
import com.example.atosetableweb.service.dto.AppSettingDTO;
import com.example.atosetableweb.service.dto.SchoolDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class IndexController {
    private final AppSettingService appSettingService;
    private final SchoolService schoolService;


    @GetMapping
    public  String verifyConfiguration() {
        List<AppSettingDTO> appSettingDTOS = appSettingService.getAll();
        List<SchoolDTO> schoolDTOS = schoolService.getAll();
        if (appSettingDTOS.isEmpty()) {
            return "redirect:/settings";
        } else if (schoolDTOS.isEmpty()) {
            return "redirect:/schools";
        }else {
            return "redirect:/dashbord";
        }
    }

}

