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

	
	//If-sats till n�r man ska k�pa biljett f�r en viss �lder.
		//under 18 �r, �ver 18 �r och 65 �r gammal.
	public void buyTicket(int price, String name, int age) {
	
		Ticket tickets1 = new Ticket(price, name, age);
		tickets.add(tickets1);
		System.out.println(  getPrice() + " kr");
		
	}
		

	public void showTicket() {
	
		System.out.println(tickets);
		
		
	}



	
}


