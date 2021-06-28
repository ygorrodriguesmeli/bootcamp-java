package Exercicio1;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("1234", "5678-2");
        ContaCorrente conta2 = new ContaCorrente("1234", "5624-2");

        conta1.deposito(200);
        conta2.deposito(1000);

        System.out.println(conta1);
        System.out.println(conta2);

        conta1.transferencia(conta2, 100);
        conta2.saque(300);

        System.out.println(conta1);
        System.out.println(conta2);

        conta2.devolucao(conta1, 50);
        conta1.saque(30);

        System.out.println(conta1);
        System.out.println(conta2);
    }
}
