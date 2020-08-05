package com.mn.topto.webapp.controllers;

import com.mn.topto.models.entity.User;
import com.mn.topto.service.abstracts.model.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "/api/user")
public class UserResourseController {

    private final UserService userService;

//    @Autowired
    public UserResourseController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public void addUser(@RequestParam String name,
                        @RequestParam String pass,
                        @RequestParam String email,
                        @RequestParam String tel){

        userService.persist(User.builder()
                .name(name)
                .password(pass)
                .email(email)
                .telefon(tel)
                .isEnabled(true)
                .links(email)
                .persistDateTime(LocalDateTime.now())
                .role("ROLE_GUEST")
                .build());
        System.out.println(name + " - "+ pass + " - "+ email + " - "+ tel);
    }
}
