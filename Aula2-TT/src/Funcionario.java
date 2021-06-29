public abstract class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario() {
    }

    public abstract double pagarSalario(double especificador);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
