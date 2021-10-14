import java.util.Scanner;
public class exer20 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float somaF = 0, mediaF = 0;
		
		System.out.println("Quantas notas serão lançadas?");
		int cont = input.nextInt();
		
		for(int i = 1; i <= cont; i++) {
		System.out.println("Digite a nota:");
		float nF = input.nextInt();
			somaF = somaF + nF;	
		}
		mediaF = somaF/cont;
		System.out.println("Média: " + mediaF);
		
		input.close();
	}

}
