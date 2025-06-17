GS-SOA 2025 - FIAP  
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
- PostgreSQL
- Lombok
- Swagger (springdoc-openapi)
- Docker
- Maven

---

## 🔗 Relacionamentos

- **Client** 1:N **PortfolioRecommendation**

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

## 🐳 Docker e Docker Compose

O projeto já contém um **Dockerfile** e um **docker-compose.yml** para facilitar a execução local junto com um banco PostgreSQL.

### 📦 Build da Imagem
```bash
docker-compose build