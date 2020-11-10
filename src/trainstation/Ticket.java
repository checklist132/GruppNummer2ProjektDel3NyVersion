package trainstation;

import java.util.ArrayList;
import java.util.Scanner;

public class Ticket {
	
	int price;
	String name;
	int age;
	//Person customer;
	//Scanner scanMoney = new Scanner(System.in);
	ArrayList<Ticket> tickets = new ArrayList<>();
	

	public Ticket(int price, String name, int age) {
		this.price = price;
		this.name = name;
		this.age = age;
		
		//this.customer = new Person(name, age);
	}
	
	

	public Ticket() {
		super();
	}



	/*public Ticket(int price, String monthlyCard) {
		this.price = price;
		this.monthlyCard = monthlyCard;
		//this.stranger = new Person(name, age);
	}*/



	/*public String getMonthlyCard() {
		return monthlyCard;
	}



	public void setMonthlyCard(String monthlyCard) {
		this.monthlyCard = monthlyCard;
	}*/

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	/*public String getRegularTicket() {
		return regularTicket;
	}

	public void setRegularTicket(String regularTicket) {
		this.regularTicket = regularTicket;
	}*/

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


