package myclasses;

public class Car 
{
	private float kmsDriven=10;
	private float fuelInTank;
	private float mileage=20;

	public void addFuel(float fill)
	{
		fuelInTank = fuelInTank + fill;
	}
	public float getFuelInTank()
	{
		return fuelInTank;
	}
	public void drive(float kmdriven)
	{
		kmsDriven = kmsDriven+ kmdriven;
		fuelInTank = fuelInTank - kmsDriven/mileage;
	}
	public float getKmsDriven()
	{
		return kmsDriven;
	}
	
	public static void main(String[] args) 
	{
		
		Car testobj = new Car();
		testobj.addFuel(1000);
		System.out.println(testobj.getFuelInTank());
		testobj.drive(24);
		System.out.println(testobj.getKmsDriven());
		System.out.println(testobj.getFuelInTank());
	}

}
