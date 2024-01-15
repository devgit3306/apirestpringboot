package com.andres.curso.springboot.webapp.springbootweb.controllers;
import com.andres.curso.springboot.webapp.springbootweb.models.User;
import com.andres.curso.springboot.webapp.springbootweb.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.*;


@RestController
@RequestMapping("/api")
public class UserRestController {
    @GetMapping("/details")
    public UserDto details(){

        UserDto userDto = new UserDto();
        User user = new User("Andres","Guzman");
        userDto.setUser(user);
        userDto.setTitle("Hola mundo Spring Boot 3");

        return userDto;


    }

    @GetMapping("/list")
    public List<User> List(){

        User user = new User("Juan","Guzman");
        User user2 = new User("Pepe","Doe");
        User user3 = new User("Jhojn","Doe");


        List<User> users = Arrays.asList(user,user2,user3);


//        List<User> users = new ArrayList<>();
//        users.add(user);
//        users.add(user2);
//        users.add(user3);

        return users;




    }






    @GetMapping("/details-map")
    public Map<String, Object> detailsMap(){
        User user = new User("Andres","Valencia");
        Map<String, Object> body = new HashMap<>();
        body.put("title","Hola mundo");
        body.put("user",user);


        return body;


    }






}
