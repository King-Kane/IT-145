
public class Pet {
	//Instance Field//
	private String petType;    //Type of pet
	private String petName;   //Pet name
	private int petAge;      //Age of pet
	private final int dogSpaces;     //Dog spaces
	private final int catSpaces;     //Cat Spaces
	private int daysStay;      //Days Pet Stayed
	private double amountDue;    //Amount customer owes
	
	//Constructor//
	public Pet() {
        petType = "None assigned";
        petName = "None assigned";
        petAge = -1;
        daysStay = -1;
    }
	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}
	
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public int getPetAge() {
		return petAge;
	}
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
	public int getDogSpaces() {
		return dogSpaces;
	}
	public void setDogSpaces(int dogSpaces) {
		this.dogSpaces = dogSpaces;
	}
	public int getCatSpaces() {
		return catSpaces;
	}
	public void setCatSpaces(int catSpaces) {
		this.catSpaces = catSpaces;
	}
	public int getDaysStay() {
		return daysStay;
	}
	public void setDaysStay(int daysStay) {
		this.daysStay = daysStay;
	}
	public double getAmountDue() {
		return amountDue;
	}
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}

	
}
