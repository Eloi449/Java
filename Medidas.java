/*Ps:
 * 1 pé tem 12 polegadas
 * 1 jarda tem 3 pés
 * 1 milha tem 1760 jardas
*/
import java.util.Scanner;
class Medidas {
    public static void main(String []args){
       
        int pe=1;
        int polegadas = 12;
        int jarda=1;
        int milha=1;
        int medida = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a extensão em pés: ");
        medida = entrada.nextInt();

        entrada.close();
        
        polegadas = medida*12;
        pe = medida*polegadas;
        jarda = medida*3;
        milha = jarda*1760;
        
        System.out.println
        System.out.println("Esse valor em polegadas é: "+polegadas);
        System.out.println("E em jardas: "+jarda);
        System.out.println("E milhas: "+milha);



    }
}
