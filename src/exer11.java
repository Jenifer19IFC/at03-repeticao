import java.util.Scanner;
public class exer11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n;
		int par = 0;
		int impar = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + " ° número inteiro:");
			n = input.nextInt();
			if(n % 2 == 0)
				par++;
			else if(n % 2 != 0)
				impar++;
		}
		System.out.println("Quantidade de pares: " + par);
		System.out.println("Quantidade de ímpares: " + impar);
		
		input.close();
	}

}
