# **Gerenciador de Jogos**

Este projeto é um sistema de gerenciamento de jogos desenvolvido com **Spring Boot**, seguindo boas práticas de design e arquitetura para aplicações web. Ele permite armazenar, consultar e manipular uma lista de jogos, utilizando tanto um banco de dados em memória (**H2**) quanto um banco de dados **PostgreSQL** configurado com **Docker Compose**.  

---

## **Funcionalidades**

- **Gerenciamento de jogos:** Criação, consulta, atualização e remoção de jogos através de endpoints RESTful.  
- **Alteração de posições:** Atualização da posição dos jogos na lista com persistência dos dados no banco.  
- **Banco de dados flexível:** Suporte ao H2 (banco de dados em memória para testes) e PostgreSQL (via Docker).  
- **Consultas personalizadas:** Realização de consultas SQL otimizadas com o Spring Data JPA.  
- **Projeções:** Projeções de dados personalizadas para otimização de consultas.  
- **Relacionamentos N-N:** Manipulação de relações complexas utilizando uma classe de associação com **Embedded ID**.  

---

## **Conceitos Utilizados**

O projeto aplica os seguintes conceitos:

### **1. Arquitetura e Design**

- **Sistemas Web e Recursos:** Implementação de endpoints para manipular recursos de jogos.  
- **Cliente/Servidor, HTTP e JSON:** Comunicação com o front-end através de requisições HTTP e troca de dados no formato JSON.  
- **Padrão REST para API Web:** Desenvolvimento seguindo os princípios REST, incluindo idempotência nos verbos HTTP.  
- **Design de Endpoints:** Implementação de endpoints intuitivos e organizados.  

### **2. Estruturação de Projeto**

- **Estruturação de Projeto Spring Rest:** Organização do projeto em camadas claras e desacopladas.  
- **Padrão de Camadas:** Separação em camadas **Controller**, **Service** e **Repository** para melhor manutenção e escalabilidade.  
- **Padrão DTO (Data Transfer Object):** Utilizado para transferir dados de forma segura e eficiente entre as camadas.  

### **3. Persistência de Dados**

- **Entidades ORM:** Utilização de JPA para mapeamento objeto-relacional das entidades.  
- **Database Seeding:** População inicial do banco de dados com dados para testes e demonstrações.  
- **Consultas SQL no Spring Data JPA:** Consultas customizadas para extrair informações específicas.  
- **Projections:** Projeções otimizadas para retorno de dados personalizados.  

### **4. Relacionamentos e Classes Avançadas**

- **Relacionamentos N-N:** Implementação de relacionamentos complexos entre entidades com uso de tabelas associativas.  
- **Classe de Associação com Embedded ID:** Uso de chave composta para gerenciar relacionamentos muitos-para-muitos.  

### **5. Ambiente de Desenvolvimento**

- **Ambiente Local com Docker Compose:** Contêiner configurado para rodar o PostgreSQL, simplificando a configuração local e garantindo consistência.  

---

## **Tecnologias Utilizadas**

- **Java** (Spring Boot)  
- **Spring Data JPA**  
- **H2 Database**  
- **PostgreSQL**  
- **Docker Compose**  
- **Postman** (para testes de endpoints)  

---

## **Requisitos**

- **JDK 17 ou superior**  
- **Docker Compose**  
- **Postman** (opcional, mas recomendado para testes)  
