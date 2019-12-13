package exercicios_java;

public class MaiorNumero {

	public int maiorNumero(int a, int b) {
		if (a > b) {
			System.out.print("O maior numero é ");
			return a;
		} else {
			System.out.print("O maior numero é ");
		}
		return b;
	}
	public static void main(String[] args) {
		MaiorNumero numero = new MaiorNumero();
		System.out.println(numero.maiorNumero(3, 4));
	}
}
