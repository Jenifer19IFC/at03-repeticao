import java.util.Scanner;
public class exer22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		
		System.out.println("Digite o número total de votantes:");
		int v = input.nextInt();
		
		for(int i = 1; i <= v; i++) {
			System.out.println("Digite 1 - Candidato A; 2 - Candidato B; 3 - Candidato C");
			int c = input.nextInt();
		
			if(c == 1)
				c1++;
			
			else if(c == 2)
				c2++;
			else if(c == 3)
				c3++;
			else
				System.out.println("Candidato inválido! Comece novamente.");
		}
			System.out.println("Quantidade de votos de cada candidato: ");
			System.out.println("Candidato A = " + c1);
			System.out.println("Candidato B = " + c2);
			System.out.println("Candidato C = " + c3);
				
		input.close();
		
	}
	
}


