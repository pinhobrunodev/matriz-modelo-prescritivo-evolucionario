import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// validação e emitir mensagem na primeira identificação de que não é simétrica, ao invés de validar a matriz até o final.

		Scanner sc = new Scanner(System.in);
		try {

			int original[][] = new int[2][2];
			int transposta[][] = new int[2][2];

			boolean isSymmetrical = false;

			int w, x, y, z;

			System.out.println("Insira o elemento (0,0) da sua matriz : ");
			w = sc.nextInt();
			System.out.println("Insira o elemento (0,1) da sua matriz : ");
			x = sc.nextInt();
			System.out.println("Insira o elemento (1,0) da sua matriz : ");
			y = sc.nextInt();
			if (x == y) {
				isSymmetrical = true;
			}
			if (isSymmetrical == false) {
				System.out.println("Não é Simétrica");
				System.exit(0);
			}
			System.out.println("Insira o elemento (1,1) da sua matriz : ");
			z = sc.nextInt();
			original[0][0] = w;
			original[0][1] = x;
			original[1][0] = y;
			original[1][1] = z;

			for (int i = 0; i < transposta.length; i++) {
				for (int j = 0; j < transposta[i].length; j++) {
					transposta[i][j] = original[j][i];
				}
			}

			if (original[0][0] == transposta[0][0] && original[0][1] == transposta[0][1]
					&& original[1][0] == transposta[1][0] && original[1][1] == transposta[1][1]) {
				isSymmetrical = true;
			}
			if (isSymmetrical) {
				System.out.println("É Simétrica");
			} else {
				System.out.println("Não é Simétrica");
			}

		} catch (InputMismatchException e) {
			System.out.println("Informe um numero do tipo Inteiro");
		} finally {
			sc.close();
		}

		/*
		 * for (int i = 0; i < m.length; i++) { for (int j = 0; j < m[i].length; j++) {
		 * System.out.print("[" + m[i][j] + "]"); } System.out.println(); }
		 */
	}

}
