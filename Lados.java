import java.util.Scanner;
class Lados {
    public static void main (String []args){
        Scanner entrada = new Scanner(System.in);
            double A,B,C;
     System.out.println("Insira três valores válidos para os lados do triângulo:");
            
            System.out.println("Insira o primeiro valor: ");
            A = entrada.nextDouble();
            System.out.println("Insira o segundo valor: ");
            B = entrada.nextDouble();
            System.out.println("Insira o último valor: ");
            C = entrada.nextDouble();
            entrada.close();
            //equilátero:
           if(A==B && A!=C && C!=B||B==C && A!=C && C!=A){
            System.out.println("Seu triângulo é isóceles!");
           }
           //equilátero:
           else if(A==B && A==C && C==B){
            System.out.println("Seu triângulo é equilátero!");
           }
           //escaleno:
           else{
            System.out.println("Seu triângulo é escaleno!");
           }
    }    
}
