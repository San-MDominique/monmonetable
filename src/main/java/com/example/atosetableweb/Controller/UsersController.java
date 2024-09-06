package com.example.atosetableweb.Controller;


import com.example.atosetableweb.model.User;
import com.example.atosetableweb.service.RoleUserService;
import com.example.atosetableweb.service.UserService;
import com.example.atosetableweb.service.dto.UserDTO;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Controller
@RequestMapping("/users")
public class UsersController {

    private final UserService userService;
    private final RoleUserService roleUserService;

    @GetMapping("/add")
    public String showAddUserPage(HttpServletRequest request, Model model){
        String currentUrl = request.getRequestURI();
        model.addAttribute("currentUrl", currentUrl);
        model.addAttribute("user", new User());
        return "user/forms";
    }

    @GetMapping("/update")
    public String showUpdateUserPage(HttpServletRequest request, Model model){
        String currentUrl = request.getRequestURI();
        model.addAttribute("currentUrl", currentUrl);
        return "user/forms";
    }

    @GetMapping
    public String showUserPage(HttpServletRequest request, Model model){
        List<UserDTO> users = userService.getAll();
        String currentUrl = request.getRequestURI();
        model.addAttribute("currentUrl", currentUrl);
        model.addAttribute("users", users);
        return "user/list";
    }

    @PostMapping
    public String saveUser(UserDTO user){
        user.setCreationDate(Date.from(Instant.now()));
        userService.save(user);
        return "redirect:/users";
    }

    @GetMapping("/{id}")
    public String showUpdateUserForm(HttpServletRequest request, Model model, @PathVariable Long id){
        String currentUrl = request.getRequestURI();
        Optional<UserDTO> user = userService.findOne(id);
        model.addAttribute("currentUrl", currentUrl);
        if(user.isPresent()){
            model.addAttribute("user", user.get());
            return "user/forms";
        }else {
            return "redirect:/users";
        }
    }

    @PostMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        userService.delete(id);
        return "redirect:/users";
    }

}
