import java.util.Scanner;
public class exer5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Um abaixo do outro
		
		int TAM = 20;
		
		for(int i = 1; i <= TAM; i++){
			System.out.println(i);
		}
		
		// Um ao lado do outro
		
		int LIM = 20;
		
		for(int i = 1; i <= TAM; i++){
			System.out.print(i + " ");
		}
		
		input.close();
	}

}
