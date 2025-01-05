package com.supportportal.SupportalApp.resource;

import com.supportportal.SupportalApp.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserResource {

    @GetMapping("/user")
    public String showUser() {
        return "Hola Mundo";
    }
}
