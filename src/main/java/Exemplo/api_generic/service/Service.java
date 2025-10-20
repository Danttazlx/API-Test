package Exemplo.api_generic.service;


import Exemplo.api_generic.model.User;
import Exemplo.api_generic.repository.Repository;

@org.springframework.stereotype.Service
public class Service {

    private Repository repository;


    public Service(Repository repository) {
        this.repository = repository;
    }


 public User salvar(User user){

        return repository.save(user);
 }






}
