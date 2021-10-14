import java.util.Scanner;
public class exer23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float somaF = 0, mediaF = 0;
		int a;
		
		System.out.println("São quantas turmas?");
		int t = input.nextInt();
		
		for(int i = 1; i <= t; i++) {
		System.out.println("Digite a quantidade de alunos:");
		a = input.nextInt();
			while(a > 40) {
				System.out.println("A turma não pode ter mais de 40 alunos!");
				System.out.println("Digite a quantidade de alunos:");
				a = input.nextInt();
			}
			somaF = somaF + a;	
		}
		
		mediaF = somaF/t;
		
		System.out.println("Média de alunos por turma: " + mediaF);
		
		input.close();
	}

}
