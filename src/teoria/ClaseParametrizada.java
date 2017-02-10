package teoria;

import java.util.ArrayList;
import java.util.List;

public class ClaseParametrizada<T> {
	private List<T> lista;
	//constructor que iniciliza la lista como vacía
	public ClaseParametrizada(){
		lista = new ArrayList<T>();
	}
	//método que añada un objeto
	public void addObjeto(T t){
		lista.add(t);
	}
	//métod que nos devuelva un elemento por poscion
	public T removeObjeto(int posicion){
		return lista.remove(posicion);
	}
	@Override
	public String toString() {
		return "ClaseParametrizada [lista=" + lista + "]";
	}
	
}
