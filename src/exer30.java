import java.util.Scanner;
public class exer30 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		int codalto = 0;
		int codbaixo = 0;
		int codgordo = 0;  
		int codmagro = 0;
		
		double maisalto = Double.MIN_VALUE;
		double maisbaixo = Double.MAX_VALUE;
		double gordo = Double.MIN_VALUE;
		double magro = Double.MAX_VALUE;
		
		double ptotal = 0;
		double atotal = 0;
		
		int x = 0;
		while (true) {
		    System.out.print("Digite o código: ");
		    int codcliente = input.nextInt();
		    if (codcliente == 0) 
		      	break;
		   
		    x ++;	
		    
		    System.out.print("Digite a altura: ");
		    double altura = input.nextDouble();
		    System.out.print("Digite o peso: ");
		    double peso = input.nextDouble();
		    ptotal+=peso;
		    atotal+=altura;
		    
		    if (peso > gordo) {
		        codgordo = codcliente;
		        gordo = peso;
		    }
		    if (peso < magro) {
		        codmagro = codcliente;
		        magro = peso;
		    }
		    if (altura > maisalto) {
		        codalto = codcliente;
		        maisalto = altura;
		    }
		    if (altura < maisbaixo) {
		        codbaixo = codcliente;
		        maisbaixo = altura;
		    }
		   
		}
		
		System.out.println("O c�digo do cliente mais alto �: " + codalto);
		System.out.println("O c�digo do cliente mais baixo �: " + codbaixo);
		System.out.println("O c�digo do cliente mais gordo �: " + codgordo);
		System.out.println("O c�digo do cliente mais magro � : " + codmagro);
		System.out.println("A m�dia da altura dos clientes �: " + (atotal/x ));
		System.out.println("A m�dia de peso dos clientes �: " + (ptotal/x ));
	
		input.close();
	}

}