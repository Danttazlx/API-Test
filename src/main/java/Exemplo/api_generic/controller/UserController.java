package Exemplo.api_generic.controller;


import Exemplo.api_generic.model.User;
import Exemplo.api_generic.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {


    private final Service service;

    public UserController(Service service) {
        this.service = service;
    }

    @PostMapping
    public User salvar(@RequestBody User user){
        return this.service.salvar(user);

    }




}
