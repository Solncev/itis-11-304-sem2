package com.solncev.controller;

import com.solncev.entity.User;
//import com.solncev.repository.UserRepository;
import com.solncev.repository.UserRepository;
import com.solncev.repository.UserRepositoryHiber;
import com.solncev.service.HelloService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    private final HelloService helloService;
    private final UserRepositoryHiber userRepositoryHiber;
    private final UserRepository userRepository;

    public HelloController(HelloService helloService, UserRepositoryHiber userRepositoryHiber
            , UserRepository userRepository
    ) {
        this.helloService = helloService;
        this.userRepository = userRepository;
        this.userRepositoryHiber = userRepositoryHiber;
    }

    @GetMapping(value = "/users",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getUsers() {
//        return userRepository.findAll();
        return userRepositoryHiber.findAll();
    }

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return helloService.sayHello(name);
    }

}
