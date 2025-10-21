package Exemplo.api_generic.service;

import Exemplo.api_generic.model.User;
import Exemplo.api_generic.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class Validar {

   private UserRepository repository;

    public Validar(UserRepository repository) {
        this.repository = repository;
    }

    public void validarNome(User user){
        if (nomeExistente(user.getNome())){
            throw new IllegalArgumentException("Nome em uso, Tente outro!!");


        }


    }

    private boolean nomeExistente(String nome){
        return repository.existsByNome(nome);


    }



}
