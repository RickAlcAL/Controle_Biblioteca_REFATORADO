package Entities.Biblioteca;

import Entities.Aluno.Aluno;
import Entities.Livro.Livro;

public class Biblioteca {
    // Dados dos livros da biblioteca:
    private Livro[] acervoLivros= {
            new Livro(1, "O Código Limpo", "Robert C. Martin", true),
            new Livro(2, "O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", true),
            new Livro(3, "Duna", "Frank Herbert", false),
            new Livro(4, "Dom Casmurro", "Machado de Assis", true)
    };

     public Livro[] getAcervoLivros() {
        return acervoLivros;
    }

    public void setAcervoLivros(Livro[] acervoLivros) {
        this.acervoLivros = acervoLivros;
    }

    // Dados dos alunos cadastrados no sistema da biblioteca e seus getters:
    private Aluno[] alunosCadastrados = {
            new Aluno(1, 0, 1),
            new Aluno(2, 1, 0),
            new Aluno(3, 0, 3),
            new Aluno(4, 2, 2)
    };

     public Aluno[] getAlunosCadastrados() {
        return alunosCadastrados;
    }

    public void setAlunosCadastrados(Aluno[] alunosCadastrados) {
         this.alunosCadastrados = alunosCadastrados;
    }

    // Variáveis para armazenar o índice do livro e do aluno sendo consultados para a ligação de dados entre os vetores:
    private Livro livroAtual;
    private Aluno alunoAtual;

     public Livro getLivroAtual() {
        return livroAtual;
    }

    public Aluno getAlunoAtual() {
        return alunoAtual;
    }

    //Metodo para verificar a existencia do livro no sistema
    public boolean verificarLivro(int id) {
         boolean temLivro= false;

         for (Livro livro : acervoLivros) {
             if (livro.getIdLivro() == id) {
                 livroAtual = livro;
                 temLivro = true;
                 break;
             }
         }

         return temLivro;
    }

    //Metodo para verificar a existencia do aluno no sistema
    public boolean verificarMatricula(int matricula) {
        boolean  temMatricula = false;

        for (Aluno aluno : alunosCadastrados) {
            if (aluno.getNumeroMatricula() == matricula) {
                alunoAtual = aluno;
                temMatricula = true;
                break;
            }
        }

        return temMatricula;
    }
}
