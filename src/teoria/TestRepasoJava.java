package teoria;

import java.util.Scanner;

public class TestRepasoJava {
	public static void main(String[] args) {
		System.out.println("Introduce un dni válido");
		Scanner in = new Scanner(System.in);
		try {
			DNI nuevo = new DNI(in.next());
			System.out.println(nuevo);
		} catch (DNIException e) {
			// TODO Auto-generated catch block
			System.out.println("Es un dni NO válido");
			System.out.println("introduce de nuevo");
			try {
				DNI nuevo = new DNI(in.next());
				System.out.println(nuevo);
			} catch (DNIException e1) {
				System.out.println("Es un dni NO válido");
			}
		} finally {
			in.close();
		}
	}
}

//********************************************\\
class DNIException extends Exception{}

//*********************************************\\

class DNI {
	private String dni;

	public DNI(String dni) throws DNIException {
		if ( dni.matches("[\\d]{8}") )
			this.dni = dni;
		else
			throw new DNIException();
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "DNI [dni=" + dni + "]";
	}
	
}