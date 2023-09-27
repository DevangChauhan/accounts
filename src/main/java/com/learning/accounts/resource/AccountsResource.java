package com.learning.accounts.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsResource {

    @GetMapping("sayHello")
    public String sayHello() {
        return "Hello World";
    }

}
