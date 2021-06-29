public class FuncionarioTecnico extends FuncionarioCLT {

    private final double BONIFICACAO_POR_META = 0.05;

    public FuncionarioTecnico(String nome, CargoFuncionario cargo) {
        super(nome, cargo);
    }

    public double pagarSalario(double metasBatidas) {
        double bonificacaoPorMetaBatida = metasBatidas * BONIFICACAO_POR_META;
        return 3200 * (1 + bonificacaoPorMetaBatida);
    }
}
