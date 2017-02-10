package teoria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeerDatos {

	public static void main(String[] args) {
		List<String> lista1 = new ArrayList<String>(); //creo la lista vacía
		try (Scanner in = new Scanner(new File("constitucion.txt"));) {
			while( in.hasNext() ){
				//System.out.println(in.next());
				lista1.add(in.next().toLowerCase());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(lista);
		//System.out.println("nº palabras leídas: " + lista.size());
		ClaseParametrizadaNueva cP1 = new ClaseParametrizadaNueva(lista1);
		//System.out.println(cP1);
		System.out.printf("En la constitución la palabra %s se repite"
				+ " %d veces%n", "ciudadanos" , cP1.calcularNumeroOcurrencia("ciudadanos"));
		lista1 = null;

		//repito para números
		List<Integer> lista2 = new ArrayList<Integer>();
		try (Scanner in = new Scanner(new File("numeros.txt"));){
			in.useDelimiter("-[\n]?");
			while(in.hasNextInt()){
				//System.out.println(in.nextInt());
				lista2.add(in.nextInt());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ClaseParametrizadaNueva cP2 =
				new ClaseParametrizadaNueva(lista2);

		System.out.printf("En los nº primos el número %d se repite"
				+ " %d veces%n", 13 , cP2.calcularNumeroOcurrencia(13));
		

	}

}
