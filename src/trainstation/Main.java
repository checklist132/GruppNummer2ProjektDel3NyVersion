package trainstation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Vi behöver en scanner för att mata in värden 
		Scanner scan  = new Scanner(System.in);
		String name = scan.next();
		int age = scan.nextInt();
		String ticket1 = scan.next();
		int price = scan.nextInt();
		
		Person person =  new Person(name, age);
		Ticket ticket = new Ticket(price, ticket1);

		
		if(18 < 65) {
			
		}
		else if( 18 > 0 ){
			
		}
		
		else {
			
		}
		

	}

}
