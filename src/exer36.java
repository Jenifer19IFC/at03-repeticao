import java.util.Scanner;
public class exer36 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		int c5 = 0;
		int c6 = 0;
		float cont = 0;
		
			System.out.println("Digite 0 - Para finalizar o conjunto de votos");
			System.out.println("1 - Farias;");
			System.out.println("2 - Maria;");
			System.out.println("3 - Alberto;");
			System.out.println("4 - Ana;");
			System.out.println("5 - Voto nulo;");
			System.out.println("6 - Voto em branco;");
			
		while(true) {
			System.out.println("Digite seu voto:");
			int c = input.nextInt();
			
			
			if( c == 0) 
				break;
			if(c == 1) {
				c1++;
				cont++;
			}if(c == 2) {
				c2++;
				cont++;
			}if(c == 3) {
				c3++;
				cont++;
			}if( c == 4) {
				c4++;
				cont++;
			}if(c == 5) {
				c5++;
				cont++;
			}if(c ==6) {
				c6++;
				cont++;
			}
		}
					
			System.out.println("Quantidade de votos de cada candidato: ");
			System.out.println("Farias = " + c1);
			System.out.println("Maria = " + c2);
			System.out.println("Alberto = " + c3);
			System.out.println("Ana = " + c4);
			System.out.println("Total de votos nulos: " + c5);
			System.out.println("Total de votos em branco: " + c6);
			float percentualnulo = ((c5*100)/  cont);
			float percentualbranco = ((c6*100)/cont);
			System.out.println("Percentual de votos nulos: " + percentualnulo+"%");
			System.out.println("Percentual de votos em branco: " + percentualbranco+"%");
			System.out.println("Total de votos "+cont);
			
			input.close();
	}

}