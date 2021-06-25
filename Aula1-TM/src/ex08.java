// Para um protótipo de supermercado, crie um programa que leia 3 produtos e imprima no console:
// nome, preço, quantidade e o valor total da compra.

public class ex08 {
    public static void main(String[] args) {
        Produto arroz = new Produto("Arroz", 10.99);
        Produto feijao = new Produto("Feijao", 14.49);
        Produto tomate = new Produto("Tomate", 9.99);
        int nArroz = 2;
        int nFeijao = 1;
        int nTomate = 5;
        double valorTotal = arroz.getPreco() * nArroz + feijao.getPreco() * nFeijao + tomate.getPreco() * nTomate;

        System.out.println("Produto 1");
        System.out.println(arroz);
        System.out.println("Quantidade: " + nArroz);
        System.out.println();
        System.out.println("Produto 2");
        System.out.println(feijao);
        System.out.println("Quantidade: " + nFeijao);
        System.out.println();
        System.out.println("Produto 3");
        System.out.println(tomate);
        System.out.println("Quantidade: " + nTomate);
        System.out.println();
        System.out.println("Valor total: R$" + valorTotal);
    }
}

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String toString(){
        return this.getNome() + "\nR$ " + this.getPreco();
    }
}
