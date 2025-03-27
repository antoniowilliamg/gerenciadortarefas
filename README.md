# **Projeto TO-DO List**

## **Descrição**
Um sistema de lista de tarefas baseado em Spring Boot, desenvolvido para gerenciar tarefas com funcionalidades como:
- Criação, atualização, exclusão e consulta de tarefas.
- Uso de banco de dados H2 para persistência.
- Migrações com Flyway.
- Arquitetura limpa com camadas bem definidas.
- Tratamento de erros centralizado.
- DTOs para transporte seguro de dados.

---

## **Tecnologias Utilizadas**
- **Java** (Spring Boot 3.x.x)
- **Banco de Dados:** H2 Database
- **Migrações:** Flyway
- **Validação:** Bean Validation (Jakarta)
- **Documentação:** Swagger/OpenAPI
- **Testes:** JUnit e Mockito
- **Ferramentas:** Postman para testes de API

---

## **Estrutura do Projeto**
### **Camadas**
1. **Model:** Representa as entidades do banco de dados.
2. **DTO (Data Transfer Object):** Gerencia os dados enviados e recebidos pela API.
3. **Repository:** Interface para manipulação de dados no banco.
4. **Service:** Camada de lógica de negócios.
5. **Controller:** Exposição de endpoints RESTful.
6. **Exception Handling:** Tratamento de erros de forma centralizada.

---

## **Configuração**
### **application.properties**
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
