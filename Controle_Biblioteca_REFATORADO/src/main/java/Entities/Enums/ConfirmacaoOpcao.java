package Entities.Enums;

public enum ConfirmacaoOpcao {
    SIM('1'),
    NAO('2'),
    INVALIDA('0');

    private final char codigo;

    ConfirmacaoOpcao(char codigo) {
        this.codigo = codigo;
    }

    public char getCodigo() {
        return codigo;
    }
    //Metodo para confirmar a opção e converter o numero para texto para aparecer ao usuario
    public static ConfirmacaoOpcao deCodigo(char codigo) {
        for (ConfirmacaoOpcao opcao : values()) {
            if (opcao.getCodigo() == codigo) {
                return opcao;
            }
        }
        return INVALIDA;
    }
}