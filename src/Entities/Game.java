package Entities;

public class Game{
	
	public int id;
	public String gameName;
	public double price;
	Campaign campaign;
	
	public Game(int id, String gameName, double price, Campaign campaign) {
		this.id = id;
		this.gameName = gameName;
		this.price = price;
		this.campaign = campaign;
	} 
	
	public Game(int id, String gameName, double price) {
		this.id = id;
		this.gameName = gameName;
		this.price = price;

	} 
	
	
	
}