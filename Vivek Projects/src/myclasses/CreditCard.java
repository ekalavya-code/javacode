package myclasses;

public class CreditCard 
{
	private double totalAmount = 0.0;
	public CreditCard()
	{
		
	}
	
	public void purchase(double amount)
	{
		totalAmount = totalAmount - amount;
	}
	
	public void payment(double amount)
	{
		totalAmount = totalAmount + amount;
	}
	public double getBalance()
	{
		return totalAmount;
	}
	public static void main(String[] args) 
	{
	
		CreditCard testobj = new CreditCard();
		testobj.payment(1000);
		System.out.println(testobj.getBalance());
		testobj.purchase(500);
		System.out.println(testobj.getBalance());
	}

}
