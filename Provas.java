import java.util.Scanner;
public class Provas {
	public static double finalMedia(double nota1, double nota2){

		//metodo pra media?

		double finalMedia;
			finalMedia = (((2*nota1)+(3*nota2))/5);
			return finalMedia;

	}

	public static void main(String []args){

		double medias;
		
		System.out.println("Digite as notas: ");
		Scanner entrada = new Scanner(System.in);
		double notaUm, notaDois;
		
		notaUm = entrada.nextDouble();
		notaDois = entrada.nextDouble();
		
		medias = finalMedia(notaUm,notaDois);
		
		System.out.println(medias);


	}

}