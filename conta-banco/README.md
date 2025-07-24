# Projeto ContaBanco - Desafio de Sintaxe Java da DIO

Este projeto foi desenvolvido como parte do desafio de sintaxe da Trilha Java Básico da [Digital Innovation One](https://www.dio.me/).

## 📝 Descrição do Projeto

O `ContaBanco` é um programa simples que simula a abertura de uma conta bancária via terminal. Ele foi criado para exercitar os conhecimentos fundamentais da sintaxe da linguagem Java, como declaração de variáveis, tipos de dados e interação com o usuário através do console.

## 🚀 Funcionalidades

* O programa recebe os seguintes dados do usuário via terminal:
    * **Número da Conta** (Inteiro)
    * **Agência** (Texto)
    * **Nome do Cliente** (Texto)
    * **Saldo** (Decimal)
* Valida entradas de números decimais para aceitar tanto **ponto (`.`)** quanto **vírgula (`,`)**.
* Exibe uma mensagem final formatada com todos os dados inseridos pelo usuário.

## 💻 Tecnologias Utilizadas

* **Java 21**
* **`java.util.Scanner`** para entrada de dados
* Controle de Fluxo e Manipulação de Tipos de Dados Primitivos
* **Git & GitHub** para versionamento de código

## 🛠️ Como Executar

Para executar este projeto localmente, siga os passos abaixo após abrir o Git Bash, por exemplo, na área de trabalho:

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/KarolRib/dio-trilha-java-basico.git

    ```

2.  **Navegue até o diretório do projeto pelo Git Bash através do da sequência de comandos abaixo:**

    ```bash
    cd dio-trilha-java-basico
    cd conta-banco
    cd src
    ```

3.  **Compile o arquivo Java:**
    ```bash
    javac ContaTerminal.java
    ```

4.  **Execute o programa:**
    ```bash
    java ContaTerminal
    ```
Seguindo o passo a passo acima, o programa iniciará no seu terminal e solicitará as informações da conta.