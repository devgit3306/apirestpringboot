package com.andres.curso.springboot.webapp.springbootweb.controllers;

import com.andres.curso.springboot.webapp.springbootweb.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@Controller
public class UserController {

    @ResponseBody
    @GetMapping("/hola")

    public Map<String, Object> hola() {
        HashMap<String, Object> map = new HashMap<>();


        map.put("Title", "Hola Mundo Spring");
        map.put("name", "Andres");
        map.put("lastname", "campos");

        return map;

    }


    @GetMapping("/details")

    public String details(Model model) {

        User user = new User("Andres", "Guzman");
        user.setEmail("andres@hotmail.com");
        model.addAttribute("title", "Hola Mundo con Spring Boot Java 2024");
        model.addAttribute("user", user);


        return "details";


    }

    @GetMapping("/details2")

    public String details2(Map<String, Object> model) {


        model.put("title", "Hola Mundo con Spring Boot Java 2024");
        model.put("name", "Juan");
        model.put("lastname", "Paredes");

        return "details";


    }

    @GetMapping("/details4")

    public String details4(Model model) {


        model.addAttribute("title", "Hola Mundo con Spring Boot Java 2024");
        model.addAttribute("name", "Andres");
        model.addAttribute("lastname", "Valencia");

        return "details";


    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        model.addAttribute("title", "Listado de usuarios");
        return "list";


    }

    @ModelAttribute("users")
    public List<User> userModel() {
        return  Arrays.asList(
                new User("Pepa", "Gonzalez"),
                new User("Lalo", "Perez", "lalo@hotmail.com"),
                new User("Juanita", "Roe"),
                new User("Andres", "Doe"));

    }




    @GetMapping("/list2")
    public String list2(ModelMap model){
        List<User>users = new ArrayList<>();

        model.addAttribute("users",users);
        model.addAttribute("title","Listado de usuarios");
        return "list";


    }

    @GetMapping("/list3")
    public String list3(ModelMap model){
        List<User>users = Arrays.asList(new User("Pepa","Gonzalez"),
                new User("Lalo","Perez","lalo@hotmail.com"),
                new User("Juanita","Roe"),
                new User("Andres","Doe"));

        model.addAttribute("users",users);
        model.addAttribute("title","Listado de usuarios");
        return "list";


    }


}
