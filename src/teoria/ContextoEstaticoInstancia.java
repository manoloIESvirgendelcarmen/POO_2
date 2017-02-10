package teoria;

public class ContextoEstaticoInstancia {
	int variableInstancia = 5;
	static int variableDeClase = 6;
	public static void main(String[] args) {
		int variableLocal1 = 7;
		//metodoDeInstancia();
		metodoDeClase();
		ContextoEstaticoInstancia cei =
				new ContextoEstaticoInstancia();
		cei.metodoDeInstancia();
		cei.metodoDeClase(); //también se puede llamar
	}
	public void metodoDeInstancia(){
		System.out.println("En el método de instancia");
		int variableLocal2 = 8;
		System.out.println("Intentando acceder a"
				+ " variableInstancia " + variableInstancia);
		System.out.println("Intentando acceder a"
				+ " variableDeClase " + variableDeClase);
		//System.out.println("Intentando acceder a"
		//		+ " variableLocal1 " + variableLocal1);
		System.out.println("Intentando acceder a"
						+ " variableLocal2 " + variableLocal2);
	}
	public static void metodoDeClase(){
		System.out.println("En el método de clase");
		int variableLocal3 = 9;
		/*System.out.println("Intentando acceder a"
				+ " variableInstancia " + variableInstancia);*/
		System.out.println("Intentando acceder a"
				+ " variableDeClase " + variableDeClase);
		/*System.out.println("Intentando acceder a"
				+ " variableLocal1 " + variableLocal1);*/
		System.out.println("Intentando acceder a"
						+ " variableLocal3 " + variableLocal3);
	}

}
