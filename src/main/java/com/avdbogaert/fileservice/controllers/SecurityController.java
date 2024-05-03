package com.avdbogaert.fileservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping("/security/secured")
    String secured() {
        return "secured";
    }

    @GetMapping("/security/not-secured")
    String notSecured() {
        return "not-secured";
    }
}
