import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int valor1, valor2, valor3;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor");
		valor1 = sc.nextInt();

		System.out.println("Digite o segundo valor");
		valor2 = sc.nextInt();

		System.out.println("Digite o terceiro valor");
		valor3 = sc.nextInt();

		if ((valor1 == valor2) && (valor2 == valor3)) {
			System.out.println("O triangulo � Equilatero");
		} else {
			if ((valor1 == valor2) && (valor2 != valor3) || (valor1 != valor2) && (valor2 == valor3)
					|| (valor1 != valor2) && (valor1 == valor3)) {
				System.out.println("O triangulo � Is�celes");
			} else {
				if ((valor1 != valor2) && (valor1 != valor3)) {
					System.out.println("O triangulo � Escaleno");
				}
			}

		}

	}

}
