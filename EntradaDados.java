import java.util.Scanner;

class EntradaDados{
		
		public static void main (String args []){

			String nome; 
			//entrada de dados faz desse jeito 
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome");
		nome = entrada.next();		//-> o que o usuario digitou vai pra ca
		
		//next retorna um valor em string
		//e armazena na variavel nome
		entrada.close();
		System.out.print("O usuário digitou: "+nome);
		



		}


}