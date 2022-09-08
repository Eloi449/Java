import java.util.Scanner;
class CalculoTipos{
	public static void main (String args []){
	
		int primeNumero, segunNumero;
        

        Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");	

		primeNumero = entrada.nextInt();


		System.out.println("Digite o segundo número: ");

		segunNumero = entrada.nextInt();

        System.out.println("***Cálculo entre ambos os números***");

	entrada.close();
		int soma = primeNumero + segunNumero;
        int divisao = primeNumero/segunNumero; 
        int multi = primeNumero*segunNumero;
        int sub = primeNumero - segunNumero; 

		System.out.println("A soma foi de: "+soma);
		System.out.println("A divisão foi de  "+divisao);
        System.out.println("A multiplicação foi de  "+multi);
        System.out.println("A subtração foi de  "+sub);
	}

}
