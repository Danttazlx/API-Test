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


    @PutMapping("{id}")
    public void atualizarUser(@PathVariable("id") Integer id,      // esse pathvariable, voce precisa indicar oque vc quer passa dentro dele no caso o ID
                              @RequestBody User user) {            // vc pega esse id e coloca dentro de um set ent vc pega esse set e atualiza junto com o novoUser
        user.setId(id);                                            // que vc esta passando na requisicao, ele pega o id pra saber qual é, e pega oque vc quer atualiza na requisicao que vc mando.
        service.atualizarUser(user);

    }


}
