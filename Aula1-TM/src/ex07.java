// Em 2021 uma startup de tecnologia, denominada de “Empresa X” é avaliada em 1,13 milhão e possui uma média de
// crescimento anual de 148%, uma concorrente do ramo, “Empresa Y”, é avaliada em 18,4 milhões e com sua média de
// crescimento anual em 32%.

// Considerando este cenário, imprima no console (conforme formatação acima) a evolução anual até que a
// empresa X ultrapasse a empresa Y em seu valor de empresa.

import java.text.DecimalFormat;

public class ex07 {
    public static void main(String[] args) {
        double X = 1.13;
        double Y = 18.4;
        int ano = 2021;
        DecimalFormat df2 = new DecimalFormat("#.##");

        while(X < Y) {
            ano++;
            X *= 2.48;
            Y *= 1.32;
            System.out.println("Empresa X - 01/01/" + ano + " Valor da empresa: " + df2.format(X) + "m");
            System.out.println("Empresa Y - 01/01/" + ano + " Valor da empresa: " + df2.format(Y) + "m");
        }
    }
}
