// Desenvolva um programa para mostrar por console os primeiros n números primos,
// sendo um valor que o usuário irá inserir pelo console.

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        while(n > 0) {
            boolean primo = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    primo = false;
                    j = i; // break;
                }
            }
            if(primo) {
                System.out.print(i + " ");
                n--;
            }
            i++;
        }
    }
}
