public class FuncionarioGerente extends FuncionarioCLT{

    private final double BONIFICACAO_POR_META = 0.125;

    public FuncionarioGerente(String nome, CargoFuncionario cargo) {
        super(nome, cargo);
    }

    public double pagarSalario(double metasBatidas) {
        double bonificacaoPorMetaBatida = metasBatidas * 0.05;
        return 6000 * (1 + bonificacaoPorMetaBatida);
    }
}
