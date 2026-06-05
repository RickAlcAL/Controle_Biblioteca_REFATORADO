package Entities.Enums;

public enum StatusRetorno {
    SUCESSO("Emprestimo realizado com sucesso!"),
    CANCELADO("Emprestimo cancelado!"),
    ALUNO_NAO_ENCONTRADO("Aluno não encontrado!"),
    LIVRO_NAO_ENCONTRADO("Livro não encontrado!"),
    LIVRO_INDISPONIVEL("Livro indisponível no momento."),
    LIMITE_ATINGIDO("Limite de emprestimos atingido"),
    BLOQUEADO_MULTA("Emprestimo bloqueado por multa");

    private final String mensagem;
    //Construtor usado para criar uma mensagem de associação para não mostrar a local da enum
    StatusRetorno(String mensagem) {
        this.mensagem = mensagem;
    }
    //Metodo para criar a mensagem
    public String getMensagem() {
        return mensagem;
    }
}