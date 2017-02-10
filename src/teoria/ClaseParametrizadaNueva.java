package teoria;

import java.util.List;

/*Es una clase genérica, que tiene como atributo
 * una coleccion parametrizada, y va a contener un 
 * método que nos va a dar el número de ocurrencias
 * de un objeto (el nº de veces que se repite en
 * la colección)
 * Además del constructor y sobreescribir toString()
 */
public class ClaseParametrizadaNueva<T> {
	//atributo: una lista dinámica de objetos
	List<T> lista;
	//constructor le pasamos una lista obtenida en otro programa

	public ClaseParametrizadaNueva(List<T> lista) {
		this.lista = lista;
	}
	//método que nos devuelve el nº de ocurrencias
	public int calcularNumeroOcurrencia(T token){
		int contador = 0;
		for (T componente : lista) {
			if ( componente.equals(token) )
			contador++;
		}
		return contador;
	}
	@Override
	public String toString() {
		return "ClaseParametrizadaNueva [lista=" + lista + "]";
	}
		
	
	
	
	
	
}
