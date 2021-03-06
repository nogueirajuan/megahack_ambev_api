# Projeto time 79 - Megahack Desafio Ambev

Nosso projeto visa aprimorar a experiência do Cliente de forma aprimorada fazendo uso de IOT para coletar informações sobre o comportamento do cliente em frente as prateleiras de produtos, conseguindo identificar quais produtos despertam a atenção e quais produtos são realmente adquiridos pelo cliente.

Neste projeto estão todas as APIs utilizadas na integração do APP Magia Ambev.

## Integrantes

Os integrantes do time 79 - desabio Ambev são:

- ![#1589F0](https://via.placeholder.com/15/1589F0/000000?text=B) `Douglas Batista`
- ![#c5f015](https://via.placeholder.com/15/c5f015/000000?text=UX) `Gabriela Biserra`
- ![#f03c15](https://via.placeholder.com/15/f03c15/000000?text=DEV) `Gabriel França`
- ![#f03c15](https://via.placeholder.com/15/f03c15/000000?text=DEV) `Gustavo Rodolfo`
- ![#f03c15](https://via.placeholder.com/15/f03c15/000000?text=DEV) `Juan Silva Nogueira`


## Tecnologias e requisitos

O projeto foi construído utilizando Java / Spring Boot e os dados estão sendo armazenados em base em memória h2.

Para executar o projeto é necessário ambiente com Maven 3.x.x + e Java 8+ utilizando o comando abaixo:

## Uso

Para rodar o projeto, a partir do diretório raiz da aplicação, basta executar o seguinte comando

```bash
mvn spring-boot:run
```

## Documentação

Para ter visão de todas APIs construídas, basta acessar a url [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Base de dados

Com a aplicação em execução, é possível consultar a base de dados acessando [localhost:8080/h2-console](http://localhost:8080/h2-console)

**URL:** jdbc:h2:mem:magiaambev  
**Usuário:** time79  
**Senha:** megahack  

