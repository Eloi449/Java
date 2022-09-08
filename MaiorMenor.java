import java.util.Scanner;
public class MaiorMenor {
    public static void main (String []args){
       
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Digite 10 valores positivos válidos: ");

        for(int a=0;a<=10;a++){ 
        System.out.println("Digite o próximo código: ");
        a = entrada.nextInt();
        }

        entrada.close();
    }
}
