import java.util.Scanner;
public class exer19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n, primo = 0;
		int div = 0;
		
		System.out.println("Digite um número inteiro:");
		n = input.nextInt();
	
		for(int i =1; i <= n;i++) {
			if((i % 2 == 1) && (i != 2) || (i == 2)){
				System.out.print(i + " | ");
				div++;
			}else {
				div++;
			}
		}
		System.out.println("Número de divisões: " + div);	
		
		input.close();
	}
}


