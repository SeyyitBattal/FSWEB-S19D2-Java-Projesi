package com.security.securityapp.controller;

import com.security.securityapp.dto.RegisterMember;
import com.security.securityapp.entity.Member;
import com.security.securityapp.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private AuthenticationService authenticationService;

    @Autowired
    public AuthController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public Member register(@RequestBody RegisterMember registerMember) {
        return authenticationService
                .register(registerMember.email(), registerMember.password());
    }

}
