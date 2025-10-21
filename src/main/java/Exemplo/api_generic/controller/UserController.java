package Exemplo.api_generic.controller;


import Exemplo.api_generic.model.User;
import Exemplo.api_generic.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/users")
public class UserController {


    private final Service service;

    public UserController(Service service) {
        this.service = service;
    }

    @PostMapping
    public User salvar(@RequestBody User user) {
        try {
            return service.salvar(user);
        } catch (IllegalArgumentException e) {

            var menssagemErro = e.getMessage();
            throw new ResponseStatusException(HttpStatus.CONFLICT, menssagemErro);


        }
    }
    @PutMapping("{id}")
    public void atualizarUser(@PathVariable("id") Integer id,
                              @RequestBody User user) {
        user.setId(id);
        service.atualizarUser(user);

    }

    @GetMapping("{id}")
    public User buscarPorId(
            @PathVariable("id") Integer id) {
        return service.buscarPorId(id);

    }


    @DeleteMapping("{id}")
    public void delite(@PathVariable("id") Integer id) {
        service.delite(id);


    }


}
