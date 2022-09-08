import java.util.Scanner;
class ParImpar {
    public static void main(String args[]){
       
	int x;

		Scanner entrada = new Scanner(System.in);
        x = entrada.nextInt();
			
		if(x%2==0){
			x=x/2;
	
	while(x>=1){
	System.out.println(x+"->");
}

	}else if(x%2!=0){
		while(x>=1){
System.out.println(x+"->");

}
		
}



}




	}
