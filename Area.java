import java.util.Scanner;
class Area {
    public static void main (String[]args){
        double area, pi=3.14;
        double raio; 

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o raio para o cálculo da área: ");
        raio = entrada.nextDouble();

        entrada.close();

        area = pi*(raio*raio);

        System.out.println("A área é de: "+area);





    }
}
