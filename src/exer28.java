import java.util.Scanner;

public class exer28 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int quanttemp, i = 0;
		float tempF, maiorF = 0, menorF = 0;
		float somaF = 0, mediaF = 0;

		System.out.println("Quantas temperaturas serão informadas?: ");
		quanttemp = input.nextInt();

		for (i = 0; i < quanttemp; i++) {
			System.out.println("Digite a temperatura:");
			tempF = input.nextFloat();

			if (i == 0) {
				maiorF = tempF;
				menorF = tempF;
				somaF = somaF + tempF;
			} else {
				if (tempF > maiorF) {
					maiorF = tempF;
					somaF = somaF + tempF;
				} else if(tempF < menorF){
					menorF = tempF;
					somaF = somaF + tempF;
				}
			}
		}
		mediaF = somaF / i;

		System.out.println("Maior temperatutura: " + maiorF);
		System.out.println("Menor temperatutura: " + menorF);
		System.out.println("Média: " + mediaF);

		input.close();
	}

}
