# Sistema de Reservas de Hotel

Este projeto é um sistema de gerenciamento de reservas de quartos em um hotel, desenvolvido com base nos princípios **SOLID** e utilizando os padrões de projeto **Facade** e **State**. A aplicação foi construída em **Java**, com gerenciamento de dependências pelo **Maven**, e apresenta uma interface no console.

---

## ✨ Funcionalidades

1. **Gerenciamento de Quartos**:
   - Visualização da disponibilidade dos quartos.
   - Gerenciamento do estado dos quartos (Disponível, Ocupado, Aguardando, limpando ).

2. **Reservas**:
   - Realização e liberação de reservas com controle de disponibilidade.

3. **Interface no Console**:
   - Permite que o usuário interaja diretamente com o sistema para realizar operações.

---

## 🛠️ Padrões de Projeto Utilizados

### **Facade**
- Centraliza e simplifica as operações relacionadas a quartos e reservas na classe `Hotel`.

### **State**
- Gerencia os diferentes estados de um quarto (Disponível, Ocupado, Em Manutenção), alterando dinamicamente seu comportamento.

---

## 📂 Estrutura do Projeto

### Organização de Pastas

- **`src/main/java`**: Código-fonte principal, incluindo a classe `app.Main`, ponto de entrada do sistema.
- **`src/main/resources`**: Recursos adicionais, como configurações.
- **`pom.xml`**: Arquivo Maven contendo dependências e plugins necessários.

### Classes Principais

- **`Quarto`**:
  - Representa os quartos do hotel e utiliza o padrão **State** para alterar dinamicamente o comportamento com base no estado.

- **`Reserva`**:
  - Implementa a lógica para reservar e liberar quartos.

- **`Hotel`**:
  - Gerencia a lista de quartos e centraliza operações do sistema, utilizando o padrão **Facade**.

- **`Main`**:
  - Localizada em `java/app/Main`, esta é a classe principal que inicia o sistema e gerencia a interface com o usuário.

---

## 🛠️ Tecnologias Utilizadas

- **Java 11+**
- **Maven** para gerenciamento de dependências
- **JUnit** para testes automatizados
- **Git/GitHub** para controle de versão

---

## 🏁 Como Executar

1. **Pré-requisitos**:
   - Certifique-se de ter o **Java 11+** e o **Maven** instalados.

2. **Clone o Repositório**:
   ```bash
   git clone https://github.com/NathanAlmeida2006/HotelDevs2Blu
   cd HotelDevs2Blu
   ```

3. **Compile o Projeto**:
   ```bash
   mvn clean compile
   ```

4. **Execute a Aplicação**:
   ```bash
   mvn exec:java -Dexec.mainClass="app.Main"
   ```

5. **Execute os Testes**:
   ```bash
   mvn test
   ```

---

## 🌟 Diferenciais

- **Princípios SOLID**:
  - Código modular e extensível, aderindo às boas práticas.
- **Padrões de projeto bem implementados**:
  - **Facade** para simplificar a interação com componentes do sistema.
  - **State** para gerenciar estados dinâmicos de quartos.

---

## 🏆 Equipe de Desenvolvimento

- **Membro 1**: Implementação da classe `Quarto` e lógica de estados.
- **Membro 2**: Desenvolvimento da classe `Reserva`.
- **Membro 3**: Gerenciamento e integração com a classe `Hotel` (Facade).
- **Membro 4**: Desenvolvimento da interface console e integração.

---

Este projeto representa uma aplicação prática de conceitos avançados de design e arquitetura de software, promovendo a colaboração em equipe e o uso de boas práticas. 🚀
