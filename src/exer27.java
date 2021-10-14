import java.util.Scanner;
public class exer27 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			int i = 0;
			double valor = 1;;
			double total = 0;
			double din;
			
			System.out.println("PS: Para encerrar digite 0");
			System.out.println("Lojas Tabajara");
		
			while(valor != 0) {
				i++;
				System.out.println("Valor do " + i + " produto:");
				valor = input.nextDouble();
				total = total + valor;
				System.out.println("Produto " + i + ": R$ " + valor);
				if(valor == 0)
					System.out.println("Compra finalizada!");
			}
		
			System.out.println("Total R$ " + total);
			System.out.println("Valor fornecido em dinheiro: ");
			din = input.nextDouble();
			System.out.println("Dinheiro: ");
			double troco = din-total;
			System.out.println("Troco: R$ " + troco);
		}
	
	}
}

