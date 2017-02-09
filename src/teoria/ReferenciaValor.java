package teoria;
//para comprobar si los argumentos o parámetros
//se pasan por valor (una copia) o por
//referencia (la posición de  memoria)
public class ReferenciaValor {

	public static void main(String[] args) {
		//con datos primitivos
		int variablePrimitiva = 5;
		System.out.println("Valor de la variable en el main antes "
				+ "de llamar al método " + variablePrimitiva);
		cambiarValor(variablePrimitiva);
		System.out.println("Valor de la variable en el main después "
				+ "de llamar al método " + variablePrimitiva);
		//con objetos
		String objeto1 = new String("hello world");
		System.out.println("Valor de la variable en el main antes "
				+ "de llamar al método " + objeto1);
		cambiarValor(objeto1);
		System.out.println("Valor de la variable en el main después "
				+ "de llamar al método " + objeto1);

	}
	public static void cambiarValor(int variablePrimitiva){
		variablePrimitiva *= 2;
		System.out.println("Valor de la variable en el método " + 
				variablePrimitiva);
	}
	public static void cambiarValor(String variableObjeto){
		variableObjeto += variableObjeto;
		System.out.println("Valor de la variable en el método " + 
				variableObjeto);
	}
}
