🏦 Sistema Bancário — Arquitetura Hexagonal (Java 21 + Maven)
Este projeto é um sistema bancário modular desenvolvido com Java 21, Maven e Arquitetura Hexagonal (Ports & Adapters).
O objetivo é construir uma aplicação evolutiva, começando com o domínio puro e avançando gradualmente para:

Implementação de casos de uso (depósito, saque, transferência)
Exposição de APIs REST com Spring Boot
Persistência em banco de dados
Consumo de microserviços
Testes manuais via Postman

O projeto foi pensado como um case de portfólio profissional, demonstrando domínio de arquitetura limpa, boas práticas e engenharia de software moderna.

🧱 Arquitetura
Este projeto utiliza Hexagonal Architecture, também conhecida como Ports & Adapters, dividindo o código em:
🔹 Domain

Entidades
Regras de negócio
Serviços de domínio
Enums

🔹 Application

Ports IN (casos de uso)
Ports OUT (interfaces para persistência e comunicação externa)
Services que orquestram o fluxo entre domínio e adapters

🔹 Adapters

IN: Controladores (REST)
OUT: Persistência (futuro: JPA/Hibernate) e integração com microserviços

🔹 Shared

DTOs
Exceptions

Isso garante baixo acoplamento e facilidade para evolução tecnológica.

⚙️ Funcionalidades atuais

Estrutura inicial com domínio modelado
Casos de uso (em evolução)
Modelo de contas (corrente/poupança)
Modelo de cliente (AccountHolder)
Enum de tipos de transação
Controller inicial para testes futuros
Estrutura preparada para adicionar:

Spring Boot
Persistência
Testes com Postman




🧩 Planos de evolução

Implementar casos de uso completos
Criar endpoints REST
Adicionar persistência em banco de dados
Implementar testes (unitários + Postman)
Criar um microserviço separado para integração
Observabilidade (logs estruturados, métricas, etc.)
Documentação da API com Swagger/OpenAPI


🏗️ Tecnologias utilizadas

Java 21
Maven
Arquitetura Hexagonal (Ports & Adapters)
Principais princípios usados:

SOLID
DDD (parcial, focado em Value Objects e Entities)
Clean Architecture




Spring Boot será integrado futuramente conforme evolução do projeto.


📁 Estrutura (parcial)
src/main/java/com.example.Conta_Bancaria

 ├── adapter
 
 │├── in
 │   │   └── AccountController
 │   └── out
 
 ├── application
 │   └── service
 │       └── AccountService
 ├── boot
 │   └── ContaBancariaApplication
 ├── model
 │   ├── Account
 │   ├── AccountHolder
 │   ├── CurrentAccount
 │   ├── SavingsAccount
 │   └── TypesTransaction
 └── shared
     ├── dto
     └── exception


🚀 Como executar o projeto

Ainda em construção, mas já pode ser executado como um projeto Java/Maven normal.

mvn clean install
mvn exec:java

Quando o Spring Boot for integrado, este README será atualizado com instruções de endpoint e execução.

🤝 Contribuições
Este é um projeto pessoal de aprendizado e portfólio.
Sugestões, melhorias e PRs são bem-vindos!

📜 Licença
MIT — sinta-se livre para usar, estudar, modificar e distribuir.
