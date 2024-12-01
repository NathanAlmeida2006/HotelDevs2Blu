Sistema de Reservas de Hotel

Este projeto é um sistema de gerenciamento de reservas de quartos em um hotel, desenvolvido com base nos princípios **SOLID** e utilizando os padrões de projeto **Facade** e **State**. A aplicação foi construída com **Java** e **Maven**, integrando boas práticas de desenvolvimento de software.

---
 ✨ Funcionalidades

1. Gerenciamento de Quartos
   - Visualização da disponibilidade.
   - Atributos como número do quarto e status de ocupação.

2. **Reservas**:
   - Lógica para reservar e liberar quartos.
   - Controle de disponibilidade para evitar conflitos.

3. **Interface no Console**:
   - Interação simples e intuitiva para exibir informações e realizar operações.

---

## 🛠️ Padrões de Projeto Utilizados

### **Facade**
- Implementado para simplificar a interação entre diferentes componentes do sistema, como a classe `Hotel`, que centraliza e abstrai as operações de gerenciamento de quartos e reservas.

### **State**
- Utilizado para gerenciar os diferentes estados dos quartos (ex.: Disponível, Ocupado, Em Manutenção), permitindo mudanças dinâmicas de comportamento conforme o estado atual.

---

## 📂 Estrutura do Projeto

### Diretórios e Arquivos

- **`src/main/java`**: Código-fonte principal organizado por pacotes.
- **`src/main/resources`**: Recursos do sistema, como configurações.
- **`src/test/java`**: Testes automatizados.
- **`pom.xml`**: Arquivo de configuração do Maven, incluindo dependências e plugins.

### Classes Principais

- **`Quarto`**:
  - Representa os quartos do hotel e usa o padrão **State** para gerenciar mudanças de status.

- **`Reserva`**:
  - Lida com a lógica de reservas, interagindo com o estado dos quartos.

- **`Hotel`**:
  - Centraliza as operações do sistema, implementando o padrão **Facade** para simplificar a interação com os outros componentes.

- **`Main`**:
  - Ponto de entrada da aplicação, gerenciando a interface do console.

---

## 🛠️ Tecnologias Utilizadas

- **Java 11+**
- **Maven** para gerenciamento de dependências
- **JUnit** para testes automatizados
- **Git/GitHub** para controle de versão

---

## 🏁 Como Executar

1. **Pré-requisitos**:
   - **Java 11+** e **Maven** instalados.

2. **Clone o Repositório**:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   cd sistema-reserva-hotel
   ```

3. **Compile o Projeto**:
   ```bash
   mvn clean compile
   ```

4. **Execute a Aplicação**:
   ```bash
   mvn exec:java -Dexec.mainClass="com.exemplo.Main"
   ```

5. **Execute os Testes**:
   ```bash
   mvn test
   ```

---

## 🌟 Diferenciais

- **Boas práticas de programação**:
  - Princípios SOLID aplicados para código modular e sustentável.
- **Padrões de projeto bem integrados**:
  - **Facade**: Simplificação da interface com o sistema.
  - **State**: Mudança dinâmica no comportamento dos objetos.

---

## 💡 Melhorias Futuras

- Implementação de persistência de dados com banco de dados.
- Criação de uma interface gráfica para melhor experiência do usuário.
- Adição de notificações automáticas para reservas e cancelamentos.

---

## 🏆 Equipe de Desenvolvimento

- **Membro 1**: Implementação da classe `Quarto` e lógica de estados.
- **Membro 2**: Desenvolvimento da classe `Reserva`.
- **Membro 3**: Gerenciamento e integração com a classe `Hotel` (Facade).
- **Membro 4**: Desenvolvimento da interface console e testes.

---

Este projeto reflete a integração de conceitos avançados de programação em equipe, promovendo aprendizado e colaboração. 🚀
