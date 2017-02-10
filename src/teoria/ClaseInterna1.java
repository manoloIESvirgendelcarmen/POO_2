package teoria;

public class ClaseInterna1 {
	//variables de clase e instancia
	private int variableInstancia;
	private static int variableDeClase = 10;
	
	//constructor
	public ClaseInterna1(int variableInstancia) {
		this.variableInstancia = variableInstancia;
	}
	//getters y setters
	public int getVariableInstancia() {
		return variableInstancia;
	}
	
	public void setVariableInstancia(int variableInstancia) {
		this.variableInstancia = variableInstancia;
	}
	public static int getVariableDeClase() {
		return variableDeClase;
	}
	public static void setVariableDeClase(int variableDeClase) {
		ClaseInterna1.variableDeClase = variableDeClase;
	}

	@Override
	public String toString() {
		return "ClaseInterna1 [variableInstancia=" + variableInstancia + "]";
	}
	
	private class Duplicador {
		private  int multiplicador;

		public Duplicador(int multiplicador) {
			this.multiplicador = multiplicador;
		}
		public void cambiarVariableInstancia(){
			variableInstancia *= multiplicador;
		}
	}
	
	public void iniciarDuplicador(int multiplicador){
		Duplicador d = new Duplicador(multiplicador);
		d.cambiarVariableInstancia();
	}
	
	public static class DuplicadorClase {
		private static int multiplicador;

		public static void setMultiplicador(int multiplicador) {
			variableDeClase *= multiplicador;
		}
		
	}
	
}
