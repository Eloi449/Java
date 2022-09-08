import java.util.Scanner;
public class CalDois {
    public static void main (String []args){

        Scanner entrada;
        entrada = new Scanner(System.in);
        int numUm=0, numDois=0, soma;

        System.out.println("Digite o primeiro número para a soma: ");
        numUm = entrada.nextInt();

        System.out.println("Digite o segundo número para a soma: ");
        numDois = entrada.nextInt();

        soma = numUm+numDois;
        entrada.close();
        System.out.println("A soma dos dois números é: "+soma);




    }


}
