package Exercicio1;

public class ContaCorrente {
    private double saldo = 0;
    private String agencia;
    private String conta;

    public ContaCorrente(String agencia, String conta) {
        this.agencia = agencia;
        this.conta = conta;
    }

    public ContaCorrente() {
    }

    public ContaCorrente(ContaCorrente conta) {
        this.saldo = conta.saldo;
        this.agencia = conta.agencia;
        this.conta = conta.conta;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void saque(double valor) {
        if(valor < this.getSaldo()) {
            this.saldo -= valor;
        }
    }

    public void devolucao(ContaCorrente destino ,double valor) {
        if(valor < this.getSaldo()) {
            this.saque(valor);
            destino.deposito(valor);
        }
    }

    public void transferencia(ContaCorrente destino, double valor) {
        if(valor < this.getSaldo()) {
            this.saque(valor);
            destino.deposito(valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "saldo=" + saldo +
                ", agencia='" + agencia + '\'' +
                ", conta='" + conta + '\'' +
                '}';
    }
}
