import java.util.Scanner;
public class exer32 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int codcid, cid=0, cidmaior = 0,cidmenor=0,cidmenos = 0;
		float qtotal=0,qmenosv = 0,qv=0, qacidente=0,acidentemaior=0,acidentemenor=999, mediamenor=0;
		
		while(cid<5) {
			System.out.println("Código da cidade: ");
				codcid = input.nextInt();
			System.out.println("Quantidade de veículos de passeios em 1999: ");
			 	qv = input.nextInt();
			 System.out.println("Quantidade de acidentes de trânnsito com vítimas em 1999: ");
			 	qacidente=input.nextFloat();
		
			 	cid++;
			 	qtotal=qv+qtotal;
		
		if (qacidente<acidentemenor) {
			cidmenor=codcid;
			acidentemenor=qacidente; 	
		}
		
		if (qacidente>acidentemaior) {
			cidmaior=codcid;
			acidentemaior=qacidente; 	
		}
				
		if (qv<2000) {
			qmenosv=qmenosv+qv;
			cidmenos++;
			mediamenor=(qmenosv/cidmenos);
		}
		
	}
		System.out.println("A cidade "+cidmaior+" é a cidade com o maior índice de acidentes com "+acidentemaior);
		System.out.println("A cidade "+cidmenor+" é a cidade com o menor índice de acidentes com "+acidentemenor);
		System.out.println("A média de veículos das 5 cidades juntas: "+(qtotal/cid));
		System.out.println("Média de acidentes nas cidades com menos de 2000 veículos: "+mediamenor);

		input.close();
	}
}


	


