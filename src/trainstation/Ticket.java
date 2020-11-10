package trainstation;

import java.util.ArrayList;
import java.util.Scanner;

public class Ticket {
	
	int price;
	String name;
	int age;
	
	ArrayList<Ticket> tickets = new ArrayList<>();
	

	public Ticket(int price, String name, int age) {
		this.price = price;
		this.name = name;
		this.age = age;
		
		
	}
	

	public Ticket() {
		super();
	}

	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	//If-sats till när man ska köpa biljett för en viss ålder.
		//under 18 år, över 18 år och 65 år gammal.
	public void buyTicket(int price, String name, int age) {
	
		Ticket tickets1 = new Ticket(price, name, age);
		tickets.add(tickets1);
		System.out.println(  getPrice() + " kr");
		
	}
		

	public void showTicket() {
	
		System.out.println(tickets);
		
		
	}



	
}


