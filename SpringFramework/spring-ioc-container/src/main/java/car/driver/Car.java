package car.driver;

public class Car {

	private int regnum;
	private String bikename;
	private String colour;
	
	public void setRegnum(int regnum) {
		this.regnum = regnum;
	}
	
	public void setBname(String bname) {
		this.bikename = bname;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void Details()
	{
		System.out.println("Registration Number : "+regnum);
		System.out.println("Brand Name : "+bikename);
		System.out.println("Car Colour  : "+colour);
	}

}
