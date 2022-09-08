/* 3.Escreva um programa em que, dada uma variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra:
•    Se x é par, x = x / 2 ;
•    Se x é impar, x = 3 * x + 1 ;
•    Imprime x ;
•    O programa deve parar quando x tiver o valor final de 1. Por exemplo, para x = 13, a saída será:
•    40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 * 
*/
import java.util.Scanner;
class Correicao {
    public static void main (String args []){
        Scanner entrada = new Scanner (System.in);

	int x;

    System.out.println("Digite um número para a verificação: ");    
    
    x=entrada.nextInt();
entrada.close();
   
while(x>1){        
    if ((x%2)==0){
                x=x/2;
        }
            else{
            x=3*x+1;
            }


System.out.print(x+"->");
    }
 

    }
}
