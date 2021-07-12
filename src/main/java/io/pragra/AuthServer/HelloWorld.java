package io.pragra.AuthServer;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/rest/hello")
public class HelloWorld {

    @GetMapping("/principal")
    public Principal user(Principal principal){
        return principal;
    }

    @GetMapping
    public String hello(){
        return "Hello this is my assignment";
    }
}
