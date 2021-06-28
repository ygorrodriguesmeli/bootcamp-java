package Exercicio4;

public class TesteFracao {
    public static void main(String[] args) {
        Fracao fracao = new Fracao();
        System.out.println(fracao.adicionar(2, 5));
        System.out.println(fracao.adicionar(2.3, 5));
        System.out.println(fracao.adicionar(2.5, 5.9));
        System.out.println(fracao.subtrair(5, 2.5));
        System.out.println(fracao.subtrair(6.7, 2.3));
        System.out.println(fracao.multiplicar(5, 10));
        System.out.println(fracao.multiplicar(2.8, 5));
        System.out.println(fracao.multiplicar(3.5, 2.5));
        System.out.println(fracao.dividir(10, 2.5));
        System.out.println(fracao.dividir(100.8, 20.3));
    }
}
