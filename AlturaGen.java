import java.util.Scanner;
class AlturaGen {
    public static void main (String []args){
       
        double h, feminino = ((62.1*h)-44.7), masculino = ((72.7*h)-58);
     
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite sua altura: "); 
        h = entrada.nextDouble();

        System.out.println("Digite seu gênero, 'M' para Masculino, 'F' para Feminino");
        String genero = entrada.nextLine();
        
        entrada.close();
        
        switch (genero) {

            case "F":
           System.out.println("O seu peso ideal é :"+(feminino);
            break;
            
            case "H":
            
           System.out.println("O seu peso ideal é :"+(masculino);
            break;
            
            default:
            System.out.println("Digite um valor válido!");
            
        }

    }
}