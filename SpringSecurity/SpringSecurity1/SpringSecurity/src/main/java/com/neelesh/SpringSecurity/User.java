package com.neelesh.SpringSecurity;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
    @GetMapping("/")
    public String Respond(HttpServletRequest request){
        return "Welcome Neelesh<br>" + request.getSession().getId();
    }
}


