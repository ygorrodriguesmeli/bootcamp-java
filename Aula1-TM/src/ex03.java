// Desenvolva um programa para informar se um um número n é primo ou não,
// sendo n um valor que o usuário irá inserir pelo console.
// Lembre-se que um número é primo quando só é divisível por 1 e por si mesmo.

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String comando = in.nextLine();
        while (!comando.equals("exit")) {
            int n = Integer.parseInt(comando);
            String primo = "primo";
            for(int i = 2; i < n; i++) {
                if(n % i == 0) {
                    primo = "não primo";
                    i = n; // break;
                }
            }
            System.out.println(primo);
            comando = in.nextLine();
        }
    }
}
