package Applications.Menu;

import Entities.Aluno.Aluno;
import Entities.Biblioteca.Biblioteca;
import Entities.Livro.Livro;
import Entities.Enums.MenuOpcao;          // Import do Enum
import Entities.Enums.ConfirmacaoOpcao;  // Import do Enum
import Entities.Enums.StatusRetorno;     // Import do Enum

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Biblioteca biblioteca = new Biblioteca();

    // Menu principal da biblioteca
    public void menuPrincipal() {
        MenuOpcao opcao; // Uso do Enum MenuOpcao

        do {
            System.out.println(
                    "==============================="+
                            "\nDigite a opção que gostaria de realizar"+
                            "\n[1]- Pegar livro emprestado"+
                            "\n[2]- Sair"+
                            "\n==============================="
            );
            char resp = sc.next().charAt(0);
            opcao = MenuOpcao.deCodigo(resp);

            switch (opcao) {
                case PEGAR_EMPRESTADO:
                    System.out.println("Informe o número de matricula do aluno:");
                    int matricula = sc.nextInt();

                    if (biblioteca.verificarMatricula(matricula)) {
                        Aluno aluno = biblioteca.getAlunoAtual();

                        if (!aluno.verificarMultas()) {
                            if (!aluno.verificarEmprestimos()) {
                                menuEmprestimo(aluno);
                            } else {
                                System.out.println(StatusRetorno.LIMITE_ATINGIDO.getMensagem());
                            }
                        } else {
                            System.out.println(StatusRetorno.BLOQUEADO_MULTA.getMensagem());
                        }
                    } else {
                        System.out.println(StatusRetorno.ALUNO_NAO_ENCONTRADO.getMensagem());
                    }
                    break;

                case SAIR:
                    System.out.println("Fechando o  sistema...");
                    break;

                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }

        } while (opcao != MenuOpcao.SAIR);

        sc.close();
    }

    // Menu de realização e confirmação de emprestimos
    private void menuEmprestimo(Aluno aluno) {
        System.out.println("Informe o código do livro:");
        int codLivro = sc.nextInt();

        if (biblioteca.verificarLivro(codLivro)) {
            Livro livro = biblioteca.getLivroAtual();

            if (livro.verificarDisponivel()) {
                ConfirmacaoOpcao confirmacao; // Uso do Enum ConfirmacaoOpcao

                do {
                    System.out.println(
                            "===============================" +
                                    "\nVocê deseja pegar este livro emprestado?:" +
                                    "\n" + livro.resumoLivro() +
                                    "\n[1]- Sim" +
                                    "\n[2]- Não" +
                                    "\n==============================="
                    );
                    char respConfirmacao = sc.next().charAt(0);
                    confirmacao = ConfirmacaoOpcao.deCodigo(respConfirmacao);

                    switch (confirmacao) {
                        case SIM:
                            System.out.println(StatusRetorno.SUCESSO.getMensagem());
                            aluno.adicionarEmprestimo();
                            livro.tirarDisponibilidade();
                            break;
                        case NAO:
                            System.out.println(StatusRetorno.CANCELADO.getMensagem());
                            break;
                        default:
                            System.out.println("Opção inválida, tente novamente.");
                            break;
                    }

                } while (confirmacao != ConfirmacaoOpcao.SIM && confirmacao != ConfirmacaoOpcao.NAO);
            } else {
                System.out.println(StatusRetorno.LIVRO_INDISPONIVEL.getMensagem());
            }
        } else {
            System.out.println(StatusRetorno.LIVRO_NAO_ENCONTRADO.getMensagem());
        }
    }
}