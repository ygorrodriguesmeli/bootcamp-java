public class Pessoa implements Precedente<Pessoa> {
    String nome;
    String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa() {
    }

    public int precedeA (Pessoa pessoa) {
        int comparison = this.cpf.compareTo(pessoa.getCpf());
        if(comparison == 0) {
            return this.nome.compareTo(pessoa.getNome());
        }
        return comparison;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
