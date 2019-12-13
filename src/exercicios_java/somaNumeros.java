package exercicios_java;

public class somaNumeros {

	public static void main(String[] args) {

		int soma = 0;
		for (int i = 1; i <= 30; i += 2) {
			System.out.println("Numeros impar " + i);
			soma += i;
		}
		System.out.println("Soma dos impares " + soma);
		int multi = 1;
        for (int i = 0; i <= 30; i+=2) {
			System.out.println("Numeros pares " + i);
			multi += i;
		}
        System.out.println("Multi dos numeros pares " + multi);
	}
}
