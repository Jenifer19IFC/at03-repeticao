import java.util.Scanner;
public class exer17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro:");
		int n = input.nextInt();
		
		if((n % 2 == 0) && (n !=2))
			System.out.println(n + " n�o � um n�mero primo");
		else if(n == 1)
			System.out.println(n + " n�o � um n�mero primo.");
		else 
			System.out.println(n + " � um n�mero primo");
		
		input.close();
		
	}

}
