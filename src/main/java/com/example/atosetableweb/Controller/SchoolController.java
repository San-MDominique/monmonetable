package com.example.atosetableweb.Controller;

import com.example.atosetableweb.service.AppService;
import com.example.atosetableweb.service.AppSettingService;
import com.example.atosetableweb.service.FileStorageService;
import com.example.atosetableweb.service.SchoolService;
import com.example.atosetableweb.service.dto.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class SchoolController {
    private final SchoolService schoolService;
    private final AppSettingService appSettingService;
    private final AppService appService;
    private final FileStorageService fileStorageService;

    @GetMapping("/schools")
    public String showAddCardPage(HttpServletRequest request, Model model){
        String currentUrl = request.getRequestURI();
        model.addAttribute("currentUrl", currentUrl);
        model.addAttribute("school", new RegistrationSchoolDto());
        return "school/forms";
    }


    @PostMapping("/PostSchool")
    public String saveStudent(SchoolDTO schoolDTO){
        AppSettingDTO settingDTO = appSettingService.getAll().stream().findFirst().orElse(null);
        schoolDTO.setAppSetting(settingDTO);
        SchoolDTO save = schoolService.save(schoolDTO);
        createUserAndRole(save);
        return "redirect:/";
    }


//    @PostMapping("/PostSchool")
//    public String saveSchool(@ModelAttribute RegistrationSchoolDto registrationSchoolDto) throws IOException {
//        fileStorageService.upload(registrationSchoolDto.getFile());
//        AppSettingDTO settingDTO = appSettingService.getAll().stream().findFirst().orElse(null);
//        registrationSchoolDto.setAppSetting(settingDTO);
//        SchoolDTO save = schoolService.save(registrationSchoolDto);
//        createUserAndRole(save);
//        return "redirect:/";
//    }

    public void createUserAndRole(SchoolDTO school){
        RoleUserDTO roleUserDTO = new RoleUserDTO();
        RoleUserDTO roleUserDTO2= new RoleUserDTO();
        RoleUserDTO roleUserDTO3= new RoleUserDTO();
        roleUserDTO.setRole("ADMIN");
        roleUserDTO2.setRole("USER");
        roleUserDTO3.setRole("OTHER");
        List<RoleUserDTO> roleUserDTOS = List.of(roleUserDTO, roleUserDTO2, roleUserDTO3);
        roleUserDTOS =appService.initRoleUser(roleUserDTOS);

        Set<RoleUserDTO> roleUserDTOSet = new HashSet<>();
        roleUserDTOSet.add(roleUserDTOS.get(0));
        Set<RoleUserDTO> roleUserDTOSet2 = new HashSet<>();
        roleUserDTOSet2.add(roleUserDTOS.get(1));
        Set<RoleUserDTO> roleUserDTOSet3 = new HashSet<>();
        roleUserDTOSet3.add(roleUserDTOS.get(2));

        UserDTO userDTO = new UserDTO();
        userDTO.setPseudo("admin");
        userDTO.setPassword("admin");
        userDTO.setRoleUser(roleUserDTOSet);

        UserDTO userDTO2 = new UserDTO();
        userDTO2.setPseudo("Dom");
        userDTO2.setPassword("user");
        userDTO2.setRoleUser(roleUserDTOSet2);

        UserDTO userDTO3 = new UserDTO();
        userDTO3.setPseudo("bahus");
        userDTO3.setPassword("bakus");
        userDTO3.setRoleUser(roleUserDTOSet3);
        List<UserDTO> listUser = List.of(userDTO, userDTO2, userDTO3);
        appService.initUser(roleUserDTOS,school,listUser);
    }
}
