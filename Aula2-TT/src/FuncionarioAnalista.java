public class FuncionarioAnalista extends FuncionarioCLT {

    private final double BONIFICACAO_POR_META = 0.08;

    public FuncionarioAnalista(String nome, CargoFuncionario cargo) {
        super(nome, cargo);
    }

    public double pagarSalario(double metasBatidas) {
        double bonificacaoPorMetaBatida = metasBatidas * BONIFICACAO_POR_META;
        return 4000 * (1 + bonificacaoPorMetaBatida);
    }
}
