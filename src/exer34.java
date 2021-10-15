import java.util.Scanner;
public class exer34 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = 0,i1 = 0,i2 = 0,i3 = 0,i4 = 0;
		
		while (true) {
			System.out.println("Digite um número");
			n=input.nextInt();
		
			if(n>0) {
				
				if ((n >= 0) && (n <= 25)) { 
					i1++;
						
				}else if ((n >= 26) && (n <= 50)) {
					i2++;
				
				}else if ((n >= 51) && (n <= 75)) {
					i3++;
				
				}else if ((n >= 76) && (n <= 100)) {
					i4++;
				}
					
			}
				
			else {
				System.out.println("Fim do programa");
				break;
			}
		}
		
		System.out.println("Quantidade de números entre 0 e 25 : "+ i1);
		System.out.println("Quantidade de números entre 26 e 50 : "+ i2);
		System.out.println("Quantidade de números entre 51 e 75 : "+ i3);
		System.out.println("Quantidade de números entre 76 e 100 : "+ i4);
		
		input.close();	
	}
}

	


