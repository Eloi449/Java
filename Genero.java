import java.util.Scanner;
class Genero {
    public static void main (String []args){
       Scanner entrada = new Scanner(System.in);
        Double h;
        String genero;
        System.out.println("Digite sua altura: "); 
        h = entrada.nextDouble();

        System.out.println("Digite seu gênero, 'H' para Masculino, 'F' para Feminino");
        genero = entrada.next();
        
        entrada.close();
        
        switch (genero) {

            case "F":
           System.out.println("O seu peso ideal é :"+((62.1*h)-44.7));
            break;
            
            case "H":
           System.out.println("O seu peso ideal é :"+((72.7*h)-58));
            break;
            
            default:
            System.out.println("Digite um valor válido!");
            
        }

    }
}