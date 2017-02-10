package teoria;

public class TestClasesInternas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseInterna1 c1 = new ClaseInterna1(12);
		c1.setVariableInstancia(13); //modificamos el valor
		//de la variable de instancia
		c1.setVariableDeClase(11); //modificamos la de clase
		ClaseInterna1.setVariableDeClase(111); //modificación de
		//la de clase, pero de otra forma
		System.out.println("Imprimo la referencia " + c1);
		System.out.println("Valor de la variable de clase " + 
				ClaseInterna1.getVariableDeClase());
		c1.iniciarDuplicador(3);
		System.out.println("Imprimo la referencia " + c1);
		ClaseInterna1.DuplicadorClase.setMultiplicador(3);
		System.out.println("Valor de la variable de clase " + 
				ClaseInterna1.getVariableDeClase());

	}

}
