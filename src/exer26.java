import java.util.Scanner;
public class exer26 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o preço do pão:");
		double preco = input.nextDouble();
		System.out.println("Preço do pão: " + preco);
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		
		int i = 0;
		double total;

		
		while(i >= 0 && i < 50) {
			++i;
			total = i * 0.18;
			System.out.println(i + " - R$ " + total);	
		}
		
		input.close();
	}

}
