import java.util.Scanner;
public class exer10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float calF = 1;
		float expF = 0;
		
		System.out.println("Digite a base:");
		float baseF = input.nextFloat();
		System.out.println("Digite o expoente:");
		expF = input.nextFloat();
		
		int i = 1;
		
		while(i <= expF) {
			calF = calF * baseF;
			i++;
		}
		System.out.println(baseF + " ^ " + expF + " = " +calF);
		
		input.close();
	}

}
