package exercicios_java;

public class NumeroDecrescente {

	public void numInteiro(int a) {
		for (int i = a; i >= 0; i--) {     
			System.out.println(i);        
		}
	}

	public static void main(String[] args) {
		NumeroDecrescente number = new NumeroDecrescente();
		number.numInteiro(10);
	}
}
