import java.util.Scanner;
public class exer26 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o pre�o do p�o:");
		double preco = input.nextDouble();
		System.out.println("Pre�o do p�o: " + preco);
		System.out.println("Panificadora P�o de Ontem - Tabela de pre�os");
		
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
