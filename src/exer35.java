import java.util.Scanner;
public class exer35 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double cq = 1.20;
		double bs = 1.30;
		double bo = 1.50;
		double h = 1.20;
		double c = 1.30;
		double r = 1;
		double item = 0 ;
		double total = 0;
		
		while(true) {
			System.out.println("Digite o código do produto: PS: Digite 0 para encerrar.");
			int cod = input.nextInt();
			System.out.println("Digite a quantidade:");
			int q = input.nextInt();
			
			if(cod == 100) {
				item = q * cq;
				total = total + item; 
				System.out.println("Item 100: R$ " + item);
			}
			if(cod == 101) {
				item = q * bs;
				total = total + item;
				System.out.println("Item 101: R$ "+ item);
			}
			if(cod == 102) {
				item = q * bo;
				total = total + item;
				System.out.println("Item 102: R$ "+ item);
			}
			if(cod == 103) {
				item = q * h;
				total = total + item;
				System.out.println("Item 103: R$ "+ item);
			}
			if(cod == 104) {
				item = q * c;
				total = total + item;
				System.out.println("Item 104: R$ "+ item);
			}
			if(cod == 105) {
				item = q * r;
				total = total + item;
				System.out.println("Item 105: R$ "+ item);
			}
			if(cod == 0) { 
				System.out.println("Compra finalizada");
				break;
			}
		}
		
		System.out.println("Preço total: R$" + total);
		
		input.close();
		
	}

}
