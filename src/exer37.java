import java.util.Scanner;
public class exer37 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ;
			
			float mediaF;
			String[] resp = new String [10];
						
				for(int j = 0; j < 10; j++) {
					System.out.println("Resposta da questão " + (j+1) + " :");
					resp[j] = input.nextLine();
				}
				
				
				System.out.println("---------------");
				
				int contp = 1, maioracerto = 0, menoracerto = 0;
				float somaF = 0;
				
				boolean x = true;
				while(x) {
					
				int acertos = 0;
				
				for(int j = 0; j < 10; j++) {
			
					System.out.println("Resposta da questão " + (j+1) + ":");
					String r = input.nextLine();
					
					if(resp[j].equals(r)) {
						acertos++;
					}else {
						System.out.println(resp[j] + " é a resposta certa");
					}
					
				}
					System.out.println("Total de acertos: " + acertos);
					System.out.println("Nota = " + acertos);
					
					if(contp == 1) {
						maioracerto = acertos;
						menoracerto = acertos;
						somaF = somaF + acertos;
					}else {
						if(acertos < menoracerto) {
							menoracerto = acertos;
							somaF = somaF + acertos;
						}else if(acertos > maioracerto) {
							maioracerto = acertos;
							somaF = somaF + acertos;
						}
					}
					
					System.out.println("Outro aluno vai utilizar o sistema?(1 - sim; 2 - não)");
					int al = input.nextInt();
					
					input.nextLine();				
					
					if(al == 1) {
						x = true;
						contp++;
					}else if(al == 2) {
						x = false;
					}
							
				}

			mediaF = (somaF/contp);
			
			System.out.println("Menor acerto: " + menoracerto);
			System.out.println("Maior acerto: " + maioracerto);
			System.out.println("Total de alunos que utilizaram o sistema: " + contp);
			System.out.println(somaF);
			System.out.println("Média: " + mediaF);
			
			input.close();	
			
	}
}
	
		
	

