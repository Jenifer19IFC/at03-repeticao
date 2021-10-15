import java.util.Scanner;
public class exer33 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double divida;
		int p1 = 1;
		int p3 = 3;
		int p6 = 6;
		int p9 = 9;
		int p12 = 12;
		double par1, par3, par6, par9, par12;
		double juros1, juros3, juros6, juros9, juros12;
		
		System.out.println("Digite o valor da dívida: ");
		divida = input.nextDouble();
		
		juros1 = 0;
		juros3 = ((divida/100)*10);
		juros6 = ((divida/100)*15);
		juros9 = ((divida/100)*20);	
		juros12 = ((divida/100)*25);
		
		par1 = (divida+juros1)/1;
		par3 = (divida+juros3)/3;
		par6 = (divida+juros6)/6;
		par9 = (divida+juros9)/9;
		par12 = (divida+juros12)/12;
		
		System.out.println("Valor da dívida --- Valor dos Juros --- Quant. de parcelas --- Valor da parcela");
		
		for(int i = 1; i <= 5; i++) {
			if( i == 1) 
				System.out.println("R$ " + divida + " ------------  " + juros1 + " ------------------- " + p1 + " --------------- R$ " + par1);
			else if(i == 2)
				System.out.println("R$ " + divida + " ------------  " + juros3 + " ------------------- " + p3 + " --------------- R$ " + par3);
			else if(i == 3)
				System.out.println("R$ " + divida + " ------------  " + juros6 + " ------------------- " + p6 + " --------------- R$ " + par6);
			else if(i == 4)
				System.out.println("R$ " + divida + " ------------  " + juros9 + " ------------------- " + p9 + " --------------- R$ " + par9);
			else if(i == 5)
				System.out.println("R$ " + divida + " ------------  " + juros12 + " ------------------- " + p12 + " --------------- R$ " + par12);
		}
			
		input.close();
			 
	}

}

	


