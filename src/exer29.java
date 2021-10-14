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

		int lim = 10;
		
		for(int i = 1; i <=lim; i++) {
			int cal = t * i;
			System.out.println(t + " x " + i + " = " + cal);
		}

	}

}
