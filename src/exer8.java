import java.util.Scanner;
public class exer8 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		int soma = 0;
		System.out.println("Digite o primeiro n�mero inteiro:");
		int pri = input.nextInt();
		System.out.println("Digite o segundo n�mero inteiro:");
		int seg = input.nextInt();
		
		pri++;
		
		for(int i = pri; i < seg; i++) {
			soma = soma + i;
			System.out.println(i + " ");
		}
		System.out.println("Soma = " + soma);
	
		input.close();
	}

}

