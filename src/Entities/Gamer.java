package Entities;

public class Gamer {

	public int id;
	public String nationalityId;
	public String firstName;
	public String lastName;
	public int birtOfYear;

	public Gamer(int id, String nationalityId, String firstName, String lastName, int birtOfYear) {
		this.id = id;
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birtOfYear = birtOfYear;
	}

}