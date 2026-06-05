package Entities.Enums;

public enum MenuOpcao {
    PEGAR_EMPRESTADO('1'),
    SAIR('2'),
    DESCONHECIDO('0');

    private final char codigo;

    MenuOpcao(char codigo) {
        this.codigo = codigo;
    }

    public char getCodigo() {
        return codigo;
    }
    //Metodo criado para converter o numero em texto
    public static MenuOpcao deCodigo(char codigo) {
        for (MenuOpcao opcao : values()) {
            if (opcao.getCodigo() == codigo) {
                return opcao;
            }
        }
        return DESCONHECIDO;
    }
}