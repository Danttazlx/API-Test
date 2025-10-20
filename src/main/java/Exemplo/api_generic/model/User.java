package Exemplo.api_generic.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "_users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String nome;


    private int idade;


}
