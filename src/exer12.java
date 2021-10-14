import java.util.Scanner;
public class exer12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int an = 0;
		int ult = 1;
		int pen = 1;
		
		System.out.print("Digite o limite para a sequência Fibonacci:");
		int lim = input.nextInt();
		
		System.out.print(pen + "  " + ult + "  " );
		
		while(an <= lim) {
			an = ult + pen;
			pen = ult;
			ult = an;
			lim++;
			System.out.print(an + "  ");
		}
			
		input.close();	

	}

}
