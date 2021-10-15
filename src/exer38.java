import java.util.Scanner;

public class exer38 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int n = input.nextInt();
		int n1 =n;
		int m = 10;
		int nf = 0; 
		
		while(n != 0 ) {
			n%= m;
			nf+= n;
			nf *= 10;
			n1-=n;
			n1/=10;
			n=n1;
		}
		nf/=10;
		
		System.out.println(nf);
		
		input.close();	
	}

}
