import java.util.Scanner;
public class exer13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int fat = 1;
		System.out.println("Digite um n�mero: ");
		int n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			fat = fat * i;
			
		}
		System.out.println("O fatorial de " + n + " � " + fat);
		
		input.close();
	}

}
