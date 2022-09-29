package com.inventory.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = "http://localhost:8080")
@Controller
public class PageController {
    
    @GetMapping("/") 
    public String showIndex() {
        return "login.html";
    }

    @GetMapping("/dashboard")
    public String showDashboard() {
        return "dashboard.html";
    }
}
