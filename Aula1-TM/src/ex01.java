import java.util.Scanner;

// Desenvolva um programa para mostrar os primeiros n números pares,
// sendo n um valor que o usuário irá inserir pelo console.
// Lembre-se que um número é par quando divisível por 2.

class ex01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String comando = in.nextLine();
		while (!comando.equals("exit")) {
			int n = Integer.parseInt(comando);
			int j = 0;
			for(int i = 0; i < n; i++) {
				System.out.print(j + " ");
				j += 2;
			}
			System.out.println();
			comando = in.nextLine();
		}
	}
}
