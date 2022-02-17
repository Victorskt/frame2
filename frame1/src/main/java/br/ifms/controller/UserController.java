package br.ifms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.ifms.model.User;
import br.ifms.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping("/listar")
    public String getUser(){
        return "Usuário localizado";
    } 
    
    @GetMapping("/")
    public ModelAndView listarTodos(){
        ModelAndView mv = new ModelAndView("listarTodos");
        List<User> users = this.userService.getUsers();
        mv.addObject("usersList", users);
        return mv;


    }

}


