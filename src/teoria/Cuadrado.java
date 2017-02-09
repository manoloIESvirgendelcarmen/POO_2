package teoria;

public class Cuadrado {
	private int arista;
	private static int numeroCuadrados = 0;
	public Cuadrado(int arista) {
		this.arista = arista;
		numeroCuadrados++;
	}
	public Cuadrado(){
		this.arista = 1;
		numeroCuadrados++;
	}
	public int getArista() {
		return arista;
	}
	public void setArista(int arista) {
		this.arista = arista;
	}
	public static int getNumeroCuadrado() {
		return numeroCuadrados;
	}
	public int getArea(){
		return arista * arista;
	}
	public int getPerimetro(){
		return arista * 4;
	}
	public double getDiagonal(){
		return arista * Math.sqrt(2);
	}
	@Override
	public String toString() {
		return "Cuadrado [arista=" + arista + "]";
	}
	
}
