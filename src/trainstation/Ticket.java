package trainstation;

import java.util.Scanner;

public class Ticket {
	
	int price;
	String regularTicket;
	//String monthlyCard;
	Person customer;
	//Scanner scanMoney = new Scanner(System.in);
	
	

	public Ticket(int price, String regularTicket, String name, int age) {
		this.price = price;
		this.regularTicket = regularTicket;
		//this.monthlyCard = monthlyCard;
		this.customer = new Person(name, age);
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

	public String getRegularTicket() {
		return regularTicket;
	}

	public void setRegularTicket(String regularTicket) {
		this.regularTicket = regularTicket;
	}

	//If-sats till när man ska köpa biljett för en viss ålder.
		//under 18 år, över 18 år och 65 år gammal.
	public void buyTicket() {
	
		
		System.out.println(getRegularTicket() + " " + getPrice() + " kr");
		
	}
		
	

	public void showTicket() {
	
		System.out.println("Ditt kvitto: ");
		System.out.println(customer + " " + getRegularTicket() + " " + getPrice() + " kr");
		
	}



	
}


