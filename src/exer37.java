import java.util.Scanner;
public class exer37 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
			
			int contp = 1, maioracerto, menoracerto;
			boolean x = true;
			while(x) {
				
			int acertos = 0;
			
			for(int i = 1; i < 11; i++) {
		
				System.out.println("Resposta da questão " + i + ":");
				String r = input.nextLine();
				
				if( i == 1) {
					if("A".equals(r))
						acertos++;
					else
						System.out.println("A é a resposta certa");
				}
				else if( i == 2) {
					if("B".equals(r))
						acertos++;
					else
						System.out.println("B é a resposta certa");
				}
				else if( i == 3) {
					if("C".equals(r))
						acertos++;
					else
						System.out.println("C é a resposta certa");
				}
				else if( i == 4) {
					if("D".equals(r))
						acertos++;
					else
						System.out.println("D é a resposta certa");
				}	
				else if( i == 5) {
					if("E".equals(r))
						acertos++;
					else
						System.out.println("E é a resposta certa");
				}
				else if( i == 6) {
					if("E".equals(r))
						acertos++;
					else
						System.out.println("E é a resposta certa");
				}
				else if( i == 7) {
					if("D".equals(r))
						acertos++;
					else
						System.out.println("D é a resposta certa");
				}
				else if( i == 8) {
					if("C".equals(r))
						acertos++;
					else
						System.out.println("C é a resposta certa");
				}
				else if( i == 9) {
					if("B".equals(r))
						acertos++;
					else
						System.out.println("B é a resposta certa");
				}
				else if( i == 10) {
					if("A".equals(r))
						acertos++;
					else
						System.out.println("A é a resposta certa");
				}
			}
	
			System.out.println("Total de acertos: " + acertos);
			System.out.println("Nota = " + acertos);
			
			System.out.println("Outro aluno vai utilizar o sistema?(1 - sim; 2 - não)");
			int al = input.nextInt();
			
			input.nextLine();
			
			if(al == 1) {
				x = true;
				contp++;
				maioracerto = acertos;
				System.out.println("----------------");
				System.out.println("Próximo aluno...");
				System.out.println("----------------");
			}else if(al == 2) {
				x = false;
			}	
		
		}
		System.out.println("Pessoas: " + contp);
		
	}
}
