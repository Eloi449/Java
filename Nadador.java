import java.util.Scanner;
class Nadador {
    public static void main (String []args){
/* Ler idade de indivíduo e classificar nas categorias:
    Infantil A - 5 a 7 anos;
 *  Infantil B - 8 a 10 anos;
 *  juvenil A - 11 a 13 anos;
 *  juvenil B - 14 a 17 anos;
 *  sênior - maiores de 17 anos;
 */     
        int nadadorIdade;
        Scanner entrada = new Scanner(System.in);
        nadadorIdade = entrada.nextInt();
        if(nadadorIdade>=5&&nadadorIdade<=7){
            System.out.println("Está classificado para a categoria Infantil A");
        }        
         else if(nadadorIdade>=8&&nadadorIdade<=10){
            System.out.println("Está classificado para a categoria Infantil B");
        }
        else if(nadadorIdade>=11&&nadadorIdade<=13){
            System.out.println("Está classificado para a categoria juvenil A");
        }
        else if(nadadorIdade>=14&&nadadorIdade<=17){
            System.out.println("Está classificado para a categoria juvenil B");
        if(nadadorIdade<17){
            System.out.println("Está classificado para a categoria sênior");
        }

        }






    }    
}
