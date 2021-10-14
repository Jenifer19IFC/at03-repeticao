import java.util.Scanner;
public class exer16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite quantos serão os números inteiros do conjunto:");
		int ns = input.nextInt();
	
		int menor = 0, maior = 0;
		
			for(int cont = 1; cont <= ns; cont++) {
				System.out.println("Digite um número do conjunto:");
				int n = input.nextInt();
				
				if(cont == 1){
						menor = n;
						maior = n;	
				}
				else {
				}if(n <= menor) {
						menor = n;
					}else if(n >= maior) {
						maior = n;
				}
			}
		int soma = menor + maior; 
		
		System.out.println("Menor = " + menor);
		System.out.println("Maior = " + maior);
		System.out.println("Soma de " + menor + " e " + maior + " = " + soma);		
		
		input.close();
	
	}
}
				

		
	
		

	


