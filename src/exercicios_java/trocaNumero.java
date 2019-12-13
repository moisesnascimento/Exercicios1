package exercicios_java;

public class trocaNumero {
   
	public void trocaPosicao(int numA, int numB) {
	 int A = numA;
	 numA = numB;
	 numB = A;
	 System.out.println(numA);
	 System.out.print(numB);
	 
	}
	public static void main(String[] args) {
		trocaNumero numero = new trocaNumero();
		numero.trocaPosicao(2, 3);
	}
}
