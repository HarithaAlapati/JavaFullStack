package com.example.protfolio_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	@GetMapping("/")
    public String showHomePage() {
        return "home"; // This will map to /templates/home.html
    }
	@GetMapping("/about")
    public String showAboutPage() {
        return "about"; // This will map to /templates/home.html
    }
	@GetMapping("/education")
    public String showEducationPage() {
        return "education"; // This will map to /templates/home.html
    }
	@GetMapping("/skills")
    public String showSkillsPage() {
        return "skills"; // This will map to /templates/home.html
    }
	@GetMapping("/contact")
    public String showContactPage() {
        return "contact"; // This will map to /templates/home.html
    }
}
