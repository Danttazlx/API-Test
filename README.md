🧩 API Teste com Spring Boot

Este projeto é uma API REST de teste criada para estudar e praticar os fundamentos do Spring Boot, JPA e banco de dados H2.
O objetivo é aprender o fluxo completo: Controller → Service → Repository → Banco. 
Estudo sobre MVC

🚀 Tecnologias Utilizadas

Java 17+

Spring Boot

Spring Web

Spring Data JPA

Lombok

H2 Database

Maven como gerenciador de dependências

🧠 Estrutura do Projeto

src/
 └── main/
      ├── java/Exemplo/api_generic/
      │    ├── controller/ → Recebe as requisições HTTP
      │    ├── service/ → Contém a lógica de negócio
      │    ├── repository/ → Faz a comunicação com o banco (JPA)
      │    └── model/ → Contém as entidades (User)
      └── resources/
           ├── application.properties → Configurações do projeto
           └── data.sql (opcional) → Dados de teste
