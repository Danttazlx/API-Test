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

 public void atualizarUser(User user){
        repository.save(user);

 }

 public User buscarPorId(Integer id ){
        return repository.findById(id).orElse(null);   // aqui ou ele retorna um o id o (user dentro do banco) ou ele retorna um null

 }





}
