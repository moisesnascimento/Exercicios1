package exercicios_java;

public class MediaAluno {

	int [] notas;
	int totalNotas = 0;
	
	public void adicionaNotas(int notas) {
		if(notas >= 0 && notas<=100) {
			this.notas = new int [notas];
			
			
			int inserirNotas = 0;
			for (int i = 0; i < this.notas.length; i++) {
				inserirNotas ++;
				totalNotas+= inserirNotas;
			}
			System.out.println("Notas: " + inserirNotas);
		}else {
			System.out.println("Error");
		}
	}
	public double calculaMedia() {
		
		
		double media = 0;
		for(int nota: notas) {
			 media = totalNotas / notas.length;
			 System.out.println(nota);
		}
		return media;
	}
}
