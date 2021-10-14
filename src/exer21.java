import java.util.Scanner;
public class exer21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float somaF = 0, mediaF = 0;
		
		System.out.println("Quantas serão as pessoas?");
		int cont = input.nextInt();
		
		for(int i = 1; i <= cont; i++) {
		System.out.println("Digite a idade:");
		int idade = input.nextInt();
			somaF = somaF + idade;	
		}
		mediaF = somaF/cont;
		System.out.println("Média: " + mediaF);
		
		if((mediaF >= 0) && ( mediaF <= 25))
			System.out.println("Turma jovem");
		else if((mediaF >= 26) && ( mediaF <= 60))
			System.out.println("Turma adulta");
		else if(mediaF > 60)
			System.out.println("Turma idosa");	

		input.close();
	}

}
