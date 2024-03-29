package com.boots.controller;

import com.boots.entity.User;
import com.boots.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/personalArea")
    public String getUser(Model model){
        model.addAttribute("userForm", new User());

        return "personalArea";
    }

    @PostMapping("/personalArea")
    public String changePassword(@ModelAttribute("userForm") @Valid User userForm,@AuthenticationPrincipal User user, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()) {
            return "personalArea";
        }
        if (!userForm.getPassword().equals(userForm.getPasswordConfirm())){
            model.addAttribute("passwordError", "Password mismatch");
            return "personalArea";
        }
        user.setPassword(userForm.getPassword());
        if(userService.update(user)){
            model.addAttribute("passwordError", "Success");
            return "personalArea";
        }else {
            return "personalArea";
        }
    }
}
