package Exemplo.api_generic.service;

import Exemplo.api_generic.model.User;
import Exemplo.api_generic.repository.UserRepository;


@org.springframework.stereotype.Service
public class Service {

    private UserRepository repository;
    private Validar validar;



    public Service(UserRepository repository, Validar validar) {
        this.repository = repository;
        this.validar = validar;

    }



    public User salvar(User user) {
        validar.validarNome(user);
        return repository.save(user);
    }


    public void atualizarUser(User user) {
        repository.save(user);


    }


    public User buscarPorId(Integer id) {
        return repository.findById(id).orElse(null);   // aqui ou ele retorna um o id o (user dentro do banco) ou ele retorna um null

    }


    public void delite(Integer id) {
        repository.deleteById(id);

    }


}
