package teoria;

import java.util.Scanner;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un valor entero:");
		Scanner in = new Scanner(System.in);
		String numeroLeido = in.next();
		in.close();
		if ( numeroLeido.matches("[\\d]+") ){
			int numero = Integer.parseInt(numeroLeido);
			Cuadrado c = new Cuadrado(numero);
			System.out.printf("Cuadrado de arista %d. El valor de "
					+ "la diagonal es %.2f y de área %d%n", c.getArista(),
					c.getDiagonal(), c.getArea());
			System.out.println("Nº de cuadrados creados: " +
					c.getNumeroCuadrado());
			for (int i = 0; i < 10; i++) {
				new Cuadrado();
			}
			System.out.println("Nº de cuadrados creados: " +
					Cuadrado.getNumeroCuadrado());
		} else {
			System.out.println("No es un valor válido");
		}
	}

}
