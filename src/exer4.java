import java.util.Scanner;
public class exer4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Parte 1(sem entrada de usu�rio)
		
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
		
		System.out.println("Ser�o necess�rios " + ano + " anos para que a popula��o do pa�s A ultrapasse ou iguale a popula��o do pa�s B, mantidas as taxas de crescimento");
		
		// Parte 2(com entrada de usu�rio)
		
		System.out.println("Digite a popula��o do pa�s A:");
		float poaF = input.nextFloat();
		System.out.println("Digite a taxa de crescimento(%):");
		float taxaF = input.nextFloat();
		System.out.println("Digite a popula��o do pa�s B:");
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
		
		System.out.println("Ser�o necess�rios " + year + " anos para que a popula��o do pa�s A ultrapasse ou iguale a popula��o do pa�s B, mantidas as taxas de crescimento");
		
		input.close();
	}
}

