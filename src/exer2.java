import java.util.Scanner;
public class exer2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String user;
		String pass;
		
		System.out.println("Digite o nome de usu�rio:");
		user = input.nextLine();
		System.out.println("Digite a senha:");
		pass = input.nextLine();
		
		while(user.equals(pass)) {
			System.out.println("Inv�lido! Senha igual ao usu�rio.");
			System.out.println("Digite o nome de usu�rio novamente:");
			user = input.nextLine();
			System.out.println("Digite a senha novamente:");
			pass = input.nextLine();			
		}

		input.close();
	}

}
