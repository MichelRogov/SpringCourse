package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.model.user.UserWebDto;
import project.model.user.UserInfoDao;
import project.service.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user/create")
    public void createUser(@RequestBody UserWebDto userWebDto){
        userService.createUser(userWebDto);
    }

    @GetMapping("user/by/{email}")
    public UserInfoDao getUserByEmail(@PathVariable String email){
        System.err.println(email);
       return userService.findUserByEmail(email);
    }
}
