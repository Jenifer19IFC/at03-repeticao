import java.util.Scanner;
public class exer1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float nF;
		
		System.out.println("Digite uma noota de 0 a 10:");
		nF = input.nextFloat();
		
		while(nF > 10 || nF < 0) {
			System.out.println("Nota inválida!");
			System.out.println("Digite uma nota de 0 a 10 novamente:");
			nF = input.nextFloat();
		}

		input.close();
	}

}
