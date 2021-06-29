public abstract class FuncionarioCLT extends Funcionario{
    private CargoFuncionario cargo;

    public FuncionarioCLT(String nome, CargoFuncionario cargo) {
        super(nome);
        this.cargo = cargo;
    }

    public FuncionarioCLT() {
    }

    public CargoFuncionario getCargo() {
        return cargo;
    }

    public void setCargo(CargoFuncionario cargo) {
        this.cargo = cargo;
    }
}
