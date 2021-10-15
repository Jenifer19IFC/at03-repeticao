import java.util.Scanner;
public class exer29 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual tabuada?");
		int t = input.nextInt();
		System.out.println("Digite o valor incial dela:");
		int inicio = input.nextInt();
		System.out.println("Digite o valor final dela:");
		int fim = input.nextInt();
		
		for(int i = inicio; i <=fim; i++) {
			if(inicio < fim) {	
				int cal = t * i;
				System.out.println(t + " x " + i + " = " + cal);
			}else {
				System.out.println("O valor inicial deve ser menor que o final!");
			}
		}
		
		input.close();
	}
}
