package trainstation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Vi behöver en scanner för att mata in värden 
		Scanner scan  = new Scanner(System.in);
		System.out.println("Namn och ålder!");
		String name = scan.next();
		int age = scan.nextInt();
		//String ticket = scan.next();
		//String card = scan.next();
		
		//Person person = new Person(name, age);
		
		
		Ticket tickets1 = new Ticket(20, "Enkelbiljett", name, age);
		Ticket tickets2 = new Ticket(35, "Enkelbiljett", name, age);
		Ticket monthly1 = new Ticket(450, "Månadskort", name, age);
		Ticket monthly2 = new Ticket(600, "Månadskort", name, age);

		
		if(age <= 18 ) {
			System.out.println("Hej! Vill du köpa ett vanlig biljett eller Månadskort:\nKnappa in 1 för Biljett; Knappa in 2 för Månadskort");
			int button = scan.nextInt();
			switch(button) {
			case 1: 
				tickets1.buyTicket();
				tickets1.showTicket();
			break;
			case 2: 
				monthly1.buyTicket();
				monthly1.showTicket();
			break;
			}
			
			
		}
		else if( age >= 65 ){
			System.out.println("Hej! Vill du köpa ett vanlig biljett eller Månadskort:\nKnappa in 1 för Biljett; Knappa in 2 för Månadskort");
			int button = scan.nextInt();
			switch(button) {
			case 1: 
				tickets1.buyTicket();
			break;
			case 2: 
				monthly1.buyTicket();
			break;
			}
			
		}
		
		else {
			System.out.println("Hej! Vill du köpa ett vanlig biljett eller Månadskort:\nKnappa in 1 för Biljett; Knappa in 2 för Månadskort");
			int button = scan.nextInt();
			switch(button) {
			case 1: 
				tickets2.buyTicket();
				tickets2.showTicket();
			break;
			case 2: 
				monthly2.buyTicket();
				monthly2.showTicket();
			break;
			}
		}
		
		
		

	}

}
