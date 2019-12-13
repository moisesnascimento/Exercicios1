package exercicios_java;

public class MediaAlunoTeste {

	public static void main(String[] args) {
       MediaAluno aluno = new MediaAluno();
       aluno.adicionaNotas(10);
       aluno.adicionaNotas(10);
       aluno.adicionaNotas(10);
       aluno.adicionaNotas(10);
       System.out.println("A media é " + aluno.calculaMedia());
	}
}
