import java.util.Scanner;
public class exer17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int n = input.nextInt();
		
		if((n % 2 == 0) && (n !=2))
			System.out.println(n + " não é um número primo");
		else if(n == 1)
			System.out.println(n + " não é um número primo.");
		else 
			System.out.println(n + " é um número primo");
		
		input.close();
		
	}

}
