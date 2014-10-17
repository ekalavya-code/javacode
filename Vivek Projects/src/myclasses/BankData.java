package myclasses;

import java.util.Scanner;

public class BankData {

	private String name;
	private int accountNo;
	private static String accountType;
	private static float balance = 1000;

	public BankData() {

	}

	public BankData(String name, int accountNo, String accountType,
			float balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.accountType = accountType;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public float getBalance() {
		return balance;
	}

	public float depositDone(float deposit) {
		balance = balance + deposit;
		return balance;
	}

	public float withdrawDone(float withdraw) {
		balance = balance + withdraw;
		return balance;
	}

	public static void main(String args[]) {
		
		BankData data = new BankData();
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the Account No:");
		int accountNo = a.nextInt();

		System.out.println("Enter the Name");
		String name = a.next();

		System.out.println("Select the type of account");
		System.out.println("1. Current Account" + "\n" + "2. Saving Account");
		int selection = a.nextInt();
		if (selection == 1) {
			System.out.println("Your account is current account");
			String accountType = "Current Account";
		} else if (selection == 2) {
			System.out.println("Your account is saving account");
			String accountType = "Saving Account";
		} else
			System.out.println("Invalid Selection");
		for (int i = 0; i < 100; i++) {
			System.out.println("Select ur action" + "\n" + "1. WithDraw" + "\n"
					+ "2. Deposit"+"3.Balance"+"4.Exit");
			int select = a.nextInt();

			if (select == 1) {
				System.out.println("Enter the amount to withdrawn:");
				float withDraw = a.nextFloat();
				if (data.balance > 0)
					data.withdrawDone(withDraw);
				else
					System.out.println("Sorry you dont have enough balance");
				continue;

			} else if (select == 2) {
				System.out.println("Enter the amount to deposit:");
				float deposit = a.nextFloat();
				data.depositDone(deposit);
				continue;
			} else if (select == 3) {
				System.out.println("your balance is: Rs"+ data.balance);
				
			}
			else if(select == 4)
			{
				System.out.println("Thankyou");
				System.exit(0);
			}
			BankData test = new BankData(name, accountNo, accountType, balance);
		}
	}
}