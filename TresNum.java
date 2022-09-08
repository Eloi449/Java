//programa que recebe tres números e mostra a media aritmetica deles
import java.util.Scanner;
    class TresNum {
    public static void main (String[] args){
            
            Scanner entrada = new Scanner(System.in);
        
            int numUm, numDois, numTres,media;

        System.out.println("Digite três números para o cálculo: ");

          System.out.println("Digite o primeiro número para o cálculo: ");
            numUm = entrada.nextInt();  
      
            System.out.println("Digite o segundo número para o cálculo: ");
            numDois = entrada.nextInt();
      
            System.out.println("Digite o terceiro número para o cálculo: ");
            numTres = entrada.nextInt();

            media = (numUm+numDois+numTres)/3;
            entrada.close();
                System.out.println("A media desses dois números é: "+media);

    }

}
