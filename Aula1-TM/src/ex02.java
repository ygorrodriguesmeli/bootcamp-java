// Desenvolva um programa para mostrar os primeiros n números múltiplos de m,
// sendo n e m valores que o usuário irá inserir via console.
// Lembre-se que um número a é divisível por b se a é divisível por b.

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.println(m + " * " + i + " = " + m*i);
        }
    }
}
