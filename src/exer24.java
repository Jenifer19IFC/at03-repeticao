import java.util.Scanner;
public class exer24 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double total = 0, media = 0;
		
		System.out.println("Quantos são os CDs?");
		int cd = input.nextInt();
		
		for(int i = 1; i <= cd; i++) {
		System.out.println("Digite o valor:");
		double v = input.nextDouble();
			total = total + v;	
		}
		media = (double) (total/cd);
		System.out.println("Valor total investido: R$ " + total);
		System.out.println("Média de valor gasto em cada CD: R$ " + media);
		
		input.close();
	}

}
