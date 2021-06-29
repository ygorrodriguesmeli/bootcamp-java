public class FuncionarioPJ extends Funcionario{
    private int pagamentoPorHora;

    public FuncionarioPJ(String nome, int pagamentoPorHora) {
        super(nome);
        this.pagamentoPorHora = pagamentoPorHora;
    }

    public double pagarSalario(double horasTrabalhadas) {
        return horasTrabalhadas * this.pagamentoPorHora;
    }

}
