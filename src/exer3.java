import java.util.Scanner;
public class exer3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char estc;
		String n;
		char sexo;
		
	       while(true){
	           System.out.println("Nome: ");
	           n = input.nextLine();
	           if (n.length() > 3) {
	        	  System.out.println("Nome v�lido");
	               break;
	           }else
	               System.out.println("O nome precisa ter mais de 3 caracteres");
	       }    
	       
	       int i;
	       while(true){
	           System.out.println("Idade: ");
	           i = input.nextInt();
	           if (i > 0 && i <= 150) {
	        	   System.out.println("Idade v�lida");
	               break;
	           }  else
	               System.out.println("A idade precisa estar entre 0 e 150 anos");
	       }
	       
	       double salario;
	       while(true){
	           System.out.println("Sal�rio: ");
	           salario = input.nextFloat();
	           if (salario > 0) {
	        	   System.out.println("S�l�rio v�lido");
	               break;
	           }else
	               System.out.println("O sal�rio precisa ser maior que 0!");
	       }
	       
	       while(true){
	           System.out.println("Sexo(f ou m): ");
	           sexo = input.next().charAt(0);	       
	           sexo = (Character.toString(sexo).toUpperCase()).charAt(0);
	           
	           if (sexo == 'M' || sexo == 'F'){
	        	   System.out.println("Sexo v�lido");
	               break;
	           }else {
	               System.out.println("D�gito inv�lido(� permitido somente f ou m)!");
	           }

	       }
	      	  
	       while(true){
	           System.out.println("Estado civil: c- casado(a); s - solteiro(a); v - vi�vo(a); d - divorciado(a).");
	           estc = input.next().charAt(0);
	           estc = (Character.toString(estc).toLowerCase()).charAt(0);

	           if (estc == 'c' || estc == 's' || estc == 'v' || estc == 'd'){
	        	   System.out.println("Estado civil v�lido");
	               break;
	           }else{
	               System.out.println("Estado civil inv�lido!");
	           }

	       }

	       input.close();

	  }

}