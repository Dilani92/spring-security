package org.dilani.springsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentController {

    @GetMapping("/home")
    public String handleWelcomePage() {
        return "index";
    }

    @GetMapping("/admin/home")
    public String handleAdminHomePage() {
        return "admin_home";
    }

    @GetMapping("/user/home")
    public String handleUserHomePage() {
        return "user_home";
    }
}
