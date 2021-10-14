import java.util.Scanner;
public class exer25 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Loja Quase Dois - Tabela de preços");
		
		int i = 0;
		double total;

		while(i >= 0 && i < 50) {
			++i;
			total = i * 1.99;
			System.out.println(i + " - R$ " + total);	
		}
		
		input.close();
	}

}
