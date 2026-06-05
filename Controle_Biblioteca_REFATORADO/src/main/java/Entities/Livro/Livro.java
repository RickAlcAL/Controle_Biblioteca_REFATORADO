package Entities.Livro;

public class Livro {
    private int idLivro;
    private String nomeLivro;
    private String autorLivro;
    private boolean disponivel;

    public Livro(int idLivro, String nomeLivro, String autorLivro, boolean disponivel) {
        this.idLivro = idLivro;
        this.nomeLivro = nomeLivro;
        this.autorLivro= autorLivro;
        this.disponivel = disponivel;
    }

    public int getIdLivro() {
        return idLivro;
    }

    // Metodo para verificar a disponibilidade do livro
    public boolean verificarDisponivel() {
        boolean estaDisponivel = false;

        if (disponivel) {
            estaDisponivel = true;
        }
        return estaDisponivel;
    }

    public void tirarDisponibilidade() {
        disponivel= false;
    }

    // Metodo que exibe os dados do livro que está sendo consultado
    public String resumoLivro() {
        return "Nome: " + nomeLivro +
                "\nAutor: " + autorLivro;
    }
}
