import java.util.Scanner;
public class exer18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n, ndiv = 0;
		
		System.out.println("Digite um n�mero inteiro:");
		n = input.nextInt();
	
		if((n % 2 == 0) && (n !=2))
			System.out.println(n + " n�o � um n�mero primo");
		else
			System.out.println(n + " � um n�mero primo");
		
		System.out.print("� divis�vel por ");
		for(int i = 1; i <= n; i++) {
			if(n % i == 0)
			System.out.print(i + " | "); 	
		}
		input.close();		
		
	}
	
}


