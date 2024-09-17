# Desafio POO DIO

## Descrição

O **Desafio POO DIO** é um projeto desenvolvido para praticar conceitos de Programação Orientada a Objetos (POO) em Java. A aplicação simula um bootcamp onde desenvolvedores podem se inscrever em cursos e mentorias, acompanhar seu progresso e calcular a experiência (XP) adquirida. O sistema inclui a definição de classes para bootcamps, cursos, mentorias e desenvolvedores, com funcionalidades para inscrição, progresso e cálculo de XP.

## Estrutura do Projeto

- **`br.com.dio.desafio.dominio`**: Contém as classes principais do domínio do sistema.
  - **`Bootcamp`**: Representa um bootcamp com informações como nome, descrição, datas, desenvolvedores inscritos e conteúdos.
  - **`Conteudo`**: Classe abstrata que define a estrutura básica para cursos e mentorias, incluindo a definição do XP padrão.
  - **`Curso`**: Subclasse de `Conteudo` que representa um curso com carga horária e cálculo de XP baseado na carga horária.
  - **`Mentoria`**: Subclasse de `Conteudo` que representa uma mentoria com uma data específica e XP adicional.
  - **`Dev`**: Representa um desenvolvedor que pode se inscrever em conteúdos, progredir e calcular o total de XP.

- **`Main`**: Classe principal que contém o método `main` para executar o programa, criar instâncias dos objetos, e demonstrar o funcionamento do bootcamp, inscrição e progresso dos desenvolvedores.

## Funcionalidades

- **Criação de Bootcamps**: Definir bootcamps com cursos e mentorias.
- **Inscrição de Desenvolvedores**: Permitir que desenvolvedores se inscrevam em bootcamps e acessem conteúdos.
- **Progresso**: Gerenciar o progresso dos desenvolvedores, movendo conteúdos inscritos para concluídos.
- **Cálculo de XP**: Calcular o XP total acumulado pelos desenvolvedores com base nos conteúdos concluídos.

## Uso

1. **Criação de Conteúdos**: Defina cursos e mentorias criando instâncias das classes `Curso` e `Mentoria`.
2. **Configuração do Bootcamp**: Crie um bootcamp e adicione os conteúdos.
3. **Inscrição e Progresso**: Inscreva desenvolvedores no bootcamp, acompanhe seu progresso e calcule o XP total.

## Dependências

- **Java 8 ou superior**: Necessário para compilar e executar o projeto.

---

Desenvolvido para o desafio de Programação Orientada a Objetos da DIO.
