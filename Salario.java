import java.util.Scanner;
class Salario {
    public static void main (String[] args){
       
        double salario, acresce,valorAtual;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário atual: ");
            salario = entrada.nextInt();
            entrada.close();
            acresce = salario *0.25;
            valorAtual = salario+acresce;
            System.out.println("O valor do seu salário atual, com o acréscimo é: "+valorAtual);

            
        



    }
}
