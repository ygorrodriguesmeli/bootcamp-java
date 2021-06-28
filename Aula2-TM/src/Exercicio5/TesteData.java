package Exercicio5;

public class TesteData {
    public static void main(String[] args) {
        Data data =  new Data(28, 6, 2021);
        data.verificaData();
        System.out.println(data);
        data.adicionaDia();
        System.out.println(data);
        data.adicionaDia();
        data.adicionaDia();
        System.out.println(data);

        Data data2 =  new Data(31, 11, 2020);
        data.verificaData();
        System.out.println(data2);
    }
}
