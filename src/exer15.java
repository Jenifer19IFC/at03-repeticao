import java.util.Scanner;
public class exer15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		int a = 38;
		int b = 39; 
		int d = 0;
		float expF = 0,s = 0;
		
		
		for(d = 1; d <= 37; d++) {
			a = a-1;
			b = b-1;
			expF = ((a * b)/d);
			s = s + expF; 
			System.out.print("(" +a + "x" + b + ")/" + d + " + "); 
		}
		System.out.println("Soma = " + s);
		
		input.close();
	}

}
