import java.util.Scanner;
public class exer6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int lim = 50;
		
		for(int i = 1; i <= lim; i++) {
			if(i % 2 != 0)
				System.out.print(i + " ");
		}

		input.close();
	}

}
