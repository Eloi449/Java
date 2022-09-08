import java.util.Scanner;
class CalculoMedia{
	public static void main (String args []){
	
		int janeiro;
		int fevereiro;
		int marco;

		Scanner entrada = new Scanner(System.in);
		
	
		System.out.println("Digite o valor do mes de janeiro: ");
			
		janeiro = entrada.nextInt();


		System.out.println("Digite o valor do mes de fevereiro: ");

		fevereiro = entrada.nextInt();


		System.out.println("Digite o valor do mes de março: ");

		marco = entrada.nextInt();


		int somaFinal = janeiro+fevereiro+marco;
		int mediaFinal = somaFinal/3;

		entrada.close();
		System.out.println("A soma do gasto foi de: "+somaFinal);
		System.out.println("A media dos gastos nesse mês foi de "+mediaFinal);
	}

}