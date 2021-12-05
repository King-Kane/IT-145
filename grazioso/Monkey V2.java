/**
 * 
 * @author Jeremiah Kane
 * @version 1.0
 *
 */
public class Monkey extends RescueAnimal {
	
	private String tailLength;             //Length of Monkeys tail//
	private String height;                 //Height of Monkeys//
	private String bodyLength;             //Length of Monkeys Body//
	private String species;              //Species of Monkeys//

	
	/**
	 * Constructor
	 * @param name
	 * @param species
	 * @param tailLength
	 * @param height
	 * @param bodyLenght
	 * @param gender
	 * @param age
	 * @param weight
	 * @param acquisitionDate
	 * @param acquisitionCountry
	 * @param trainingStatus
	 * @param reserved
	 * @param inServiceCountry
	 */
	public Monkey(String name, String species, String tailLength, String height, String bodyLenght, String gender, String age, String weight, String acquisitionDate, 
			String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry) {
		
		setName(name);
        setSpecies(species);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLenght);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
	}

	public String getTailLength() {
		return tailLength;
	}

	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getBodyLength() {
		return bodyLength;
	}

	public void setBodyLength(String bodyLenght) {
		this.bodyLength = bodyLenght;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	@Override
    public String toString() {
        return getName() + ",       " + getTrainingStatus() + ",       " + getAcquisitionLocation() + ",       " + getReserved() + "\n";
	}
}
