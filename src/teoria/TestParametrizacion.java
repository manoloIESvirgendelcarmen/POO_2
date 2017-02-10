package teoria;

public class TestParametrizacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseParametrizada<Double> claseParametrizada= 
				new ClaseParametrizada<Double>();
		for (int i = 0; i < 10; i++) {
			claseParametrizada.addObjeto(i*1.0);
		}
		int aleatorio = (int) (Math.random() * 10);
		claseParametrizada.removeObjeto(aleatorio);
		System.out.println(claseParametrizada);
	}

}
