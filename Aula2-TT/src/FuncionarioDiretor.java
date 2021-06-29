public class FuncionarioDiretor extends FuncionarioCLT {

    private final double PARTICIPACAO_DIRETOR = 0.03;

    public FuncionarioDiretor(String nome, CargoFuncionario cargo) {
        super(nome, cargo);
    }

    public double pagarSalario(double lucroEmpresa) {
        double participacaoNosLucros = lucroEmpresa * PARTICIPACAO_DIRETOR;
        return 15000 + participacaoNosLucros;
    }
}
