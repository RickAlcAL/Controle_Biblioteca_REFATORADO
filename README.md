# Sistema de Controle de Biblioteca

Sistema desenvolvido em Java voltado para o gerenciamento interno de circulação de acervos literários e controle de pendências de alunos.

## 🛠️ Tecnologias e Conceitos
* **Linguagem:** Java
* **Paradigma:** Orientação a Objetos (POO)
* **Encapsulamento:** Getters, setters e métodos de verificação especialistas
* **Controle de Fluxo:** Enums (`MenuOpcao`, `ConfirmacaoOpcao`, `StatusRetorno`)

## 🚀 Funcionalidades
* **Validação de Matrícula:** Verificação instantânea do cadastro do estudante no sistema.
* **Regras de Negócio Estritas:** Bloqueio automático de novos empréstimos caso o aluno possua multas ou já tenha atingido o limite de 3 livros ativos.
* **Atualização de Inventário:** Alteração em tempo real do status de disponibilidade do livro no acervo após a confirmação.
