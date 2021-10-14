import java.util.Scanner;
public class exer4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Parte 1(sem entrada de usuário)
		
		float popaF = 80000;
		float popbF = 200000;
		int ano = 0;
		
		float taxaaF = (float)0.03;
		float taxabF = (float)0.015;
		
		while (popaF < popbF) {
			ano++;
			popaF = (popaF * taxaaF) + popaF;
			popbF = (popbF * taxabF) + popbF;
		}
		
		System.out.println("Serão necessários " + ano + " anos para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento");
		
		// Parte 2(com entrada de usuário)
		
		System.out.println("Digite a população do país A:");
		float poaF = input.nextFloat();
		System.out.println("Digite a taxa de crescimento(%):");
		float taxaF = input.nextFloat();
		System.out.println("Digite a população do país B:");
		float pobF = input.nextFloat();
		System.out.println("Digite a taxa de crescimento(%):");
		float taxbF = input.nextFloat();
		
		taxaF = taxaF/100;
		taxbF = taxbF/100;
		int year = 0;
		
		while(poaF < pobF) {
			year++;
			poaF = (poaF * taxaF) + poaF; 
			pobF = (pobF * taxbF) + pobF;
		}
		
		System.out.println("Serão necessários " + year + " anos para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento");
		
		input.close();
	}
}

