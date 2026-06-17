# ⚽ Copa GC - Sistema de Placar da Copa do Mundo

## 📋 Sobre o Projeto

O Copa GC é um sistema de console desenvolvido em Java para gerenciar informações básicas de uma Copa do Mundo fictícia. 
com o objetivo de aplicar praticas de versionamento de codigo utilizando Git e GitHub.

O sistema permite listar as seleções por grupo, registrar os resultados das partidas, exibir a classificação dos grupos e listar os artilheiros cadastrados.

Todos os dados são armazenados em memória, sem utilização de banco de dados ou arquivos externos.

---

## 🏗️ Estrutura do Projeto

```text
copa-gc/
├── src/
│   ├── model/
│   │   ├── Selecao.java
│   │   └── Partida.java
│   ├── service/
│   │   └── Copa.java
│   ├── util/
│   │   └── CargaInicial.java
│   └── Main.java
├── .gitignore
└── README.md
```

---

## Estrutura de Pacotes

### model
Esse pacote contém as classes que representam os dois modelos do sistema.

- Selecao: representa uma seleção participante da Copa.
- Partida: representa uma partida entre duas seleções, armazenando os times envolvidos e o placar.

### service
Esse pacote contém a lógica de negócio principal do sistema.

- Copa: gerencia as listas de seleções, partidas e artilheiros, além de disponibilizar métodos como consulta e classificação.

### util
Esse pacote contém classes auxiliares para carga inicial de dados:

- CargaInicial: responsável por carregar dados iniciais, como seleções, partidas e artilheiros fictícios para testes e demonstração.

### Main
esse pacote contém a classe principal da aplicação:

- Responsável por iniciar o sistema, 
- exibir o menu principal
- direcionar as operações escolhidas pelo usuário para a classe Copa.

---

## 🖥️ Menu Principal

```text
=== Copa GC — Menu Principal ===

1. Listar seleções por grupo
2. Registrar resultado de partida
3. Exibir classificação do grupo
4. Listar artilheiros
0. Sair
```
---

## 📝 Convenção de Commits

O projeto utiliza o padrão **Conventional Commits**.

### Exemplos

```text
feat(modelos): cria classe Selecao
feat(copa): implementa calcularClassificacao
docs(readme): atualiza instrucoes de uso
fix(main): corrige leitura do Scanner
```
---

## ➜ Como Executar (versao A)

**Pré-requisitos**
- Java JDK 17+
- IDE (Intellij, Eclipse ou VS Code.)

**Execução**
1. Clone este repositório:

```bash
git clone https://github.com/Demicouto/copa-gc.git
```
---

2. Abra o projeto e execute a classe `Main.java` para iniciar o sistema:

