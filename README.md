# Projeto Conta Bancária em Java

Este é um projeto simples em Java que simula a criação e manipulação de contas bancárias, utilizando conceitos de **Programação Orientada a Objetos (POO)**, como encapsulamento e associação entre classes.

## 🧱 Estrutura

- `Cliente.java` - Representa o titular da conta (nome, CPF e profissão)
- `Conta.java` - Contém a lógica da conta bancária (saldo, depósito, saque, transferência)
- `CriarConta.java` - Classe com o método `main()` para executar o programa

## 📁 Pacotes

- `cliente` - Contém a classe `Cliente`
- `contas` - Contém a lógica bancária (`Conta`) e a classe principal (`CriarConta`)

## 🚀 Funcionalidades

- Criar contas com titular
- Depositar e sacar valores
- Transferir saldo entre contas
- Testar a independência entre instâncias de contas

## 🛠️ Tecnologias

- Java 8 ou superior
- VS Code ou IntelliJ (recomendado)

## ▶️ Como executar

1. Compile os arquivos:
   ```bash
   javac -d bin src/cliente/Cliente.java src/contas/Conta.java src/contas/CriarConta.java

