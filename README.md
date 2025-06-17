# 💡 GS-SOA 2025 - FIAP  
### Disciplina: **Sistemas Orientados a Objetos e Serviços (SOA)**  
**Aplicação Spring Boot - Assessor Virtual de Investimentos XP**

---

## 📘 Descrição do Projeto

Este projeto consiste em uma API RESTful desenvolvida com **Spring Boot**, com o objetivo de **gerenciar clientes, ativos e recomendações de carteira de investimentos**, simulando o funcionamento de um assessor virtual da XP Investimentos.

O sistema permite o cadastro de perfis de clientes, informações detalhadas sobre ativos disponíveis e o envio de recomendações personalizadas de carteira para cada cliente.

---

## 🛠️ Tecnologias Utilizadas

- Java 21
- Spring Boot 3.5
- Spring Data JPA
- Oracle Database
- Lombok
- Swagger (springdoc-openapi)
- Maven

---

## 🔗 Relacionamentos

- **Client** 1:N **PortfolioRecommendation**
- Opcionalmente: Pode-se futuramente criar um relacionamento ManyToMany entre **PortfolioRecommendation** e **Asset**, caso queira detalhar os ativos de cada carteira.

---

## 📋 Funcionalidades da API

### 📍 Client
- `POST /clients` – Criar cliente
- `GET /clients/{id}` – Buscar cliente por ID
- `GET /clients` – Listar todos os clientes
- `PUT /clients/{id}` – Atualizar cliente
- `DELETE /clients/{id}` – Remover cliente

### 📍 Asset
- `POST /assets` – Criar ativo
- `GET /assets/{id}` – Buscar ativo por ID
- `GET /assets` – Listar todos os ativos
- `PUT /assets/{id}` – Atualizar ativo
- `DELETE /assets/{id}` – Remover ativo

### 📍 PortfolioRecommendation
- `POST /recommendations` – Criar recomendação de carteira
- `GET /recommendations/{id}` – Buscar recomendação por ID
- `GET /recommendations` – Listar todas as recomendações
- `PUT /recommendations/{id}` – Atualizar recomendação
- `DELETE /recommendations/{id}` – Remover recomendação

---

## 🧪 Swagger

Após subir a aplicação, acesse a documentação da API em:

📎 [`http://localhost:8080/swagger-ui/index.html`](http://localhost:8080/swagger-ui/index.html)

---

## 🧑‍💻 Como Executar Localmente

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/gs-soa-xp2025.git
cd gs-soa-xp2025
```

2. Configure as credenciais de conexão ao banco Oracle no `application.properties`.

3. Compile e execute o projeto:

```bash
./mvnw spring-boot:run
```
