package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
/*    @Autowired
    UserService userService;*/

    @PostMapping("/test")
    public String test(@RequestBody Object body){
        System.out.println("===========================");
        System.out.println(body.toString());
        return body.toString();
    }

/*    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/user")
    public List<User> listUsers(){
        return userService.listUsers();
    }*/

}
