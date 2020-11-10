package trainstation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Vi behöver en scanner för att mata in värden 
		Scanner scan  = new Scanner(System.in);
		
		String name = scan.next();
		int age = scan.nextInt();
		//String ticket = scan.next();
		//String card = scan.next();
		int price = scan.nextInt();
		Ticket tickets = new Ticket();
		
		
		if(age <= 18 ) {
			
			int button = scan.nextInt();
			switch(button) {
			case 1:
				
				tickets.buyTicket(price, name, age);
				tickets.showTicket();
			break;
			case 2: 
				
			break;
			}
			
			
		}
		else if( age >= 65 ){
			
			int button = scan.nextInt();
			switch(button) {
			case 1: 
				tickets.buyTicket(price, name, age);
			break;
			case 2: 
				
			break;
			}
			
		}
		
		else {
			
			int button = scan.nextInt();
			switch(button) {
			case 1: 
				
			break;
			case 2: 
				
			break;
			}
		}
		
		
		

	}

}
