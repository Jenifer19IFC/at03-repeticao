import java.util.Scanner;
public class exer9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual tabuada?");
		int t = input.nextInt();
		
		int lim = 10;
		
		for(int i = 1; i <=lim; i++) {
			int cal = t * i;
			System.out.println(t + " x " + i + " = " + cal);
		}
		
		input.close();
	}

}
