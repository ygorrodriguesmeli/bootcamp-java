// Desenvolver um programa para exibição por console os n primeiros números naturais que têm pelo menos
// de m dígitos de d, sendo n, m e d valores que o utilizador vai enviar pelo console.

// Por exemplo: se o usuário inserir n = 5, m = 2 e d = 3, o programa deve exibir os primeiros 5 números naturais
// que tenham pelo menos 2 dígitos 3 no console. Neste caso, a saída será: 33, 133 , 233, 303, 313.
// Dependendo de como você decidir abordar a solução para este exercício, pode ser necessário usar recursos que
// ainda não estudamos. O desafio é pesquisar no Google como usar esses recursos e usá-los!

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();

        int i = 0;
        while(n > 0) {
            if (String.valueOf(i).contains(Integer.toString(d))) {
                String[] splited = Integer.toString(i).split("");
                int[] integerSplited = new int[splited.length];
                int mComparator = 0;
                for (int j = 0; j < splited.length; j++) {
                    if (Integer.parseInt(splited[j]) == d) mComparator++;
                }
                if (mComparator >= m) {
                    n--;
                    System.out.print(i + " ");
                }
            }
            i++;
        }
    }
}
