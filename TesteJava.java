import java.util.Scanner;
public class TesteJava{
    public static void main (String []args){
     double h;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite sua altura: "); 
       h = entrada.nextDouble();
       System.out.println("VALOR"+((62.1*h)-44.7));

    }
}