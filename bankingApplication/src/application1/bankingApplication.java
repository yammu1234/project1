package application1;

import java.util.Scanner;

public class bankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		BankAccount  bank1 = new BankAccount("yamuna", "01");
		bank1.showMenu ();
	}

 static class BankAccount {
	 int balance;
	 int previousTranscation;
	 String customerName;
	 String customerID;
	 
	BankAccount(String cname, String cid) {
		customerName = cname;
		customerID = cid;
		balance =0;
		previousTranscation = 0;
	}
	 
	 void deposit (int amount) {
		 if (amount !=0) {
			 balance += amount;
			 previousTranscation = amount;
		 }
	 }
			 
			 
		void withdraw (int amount) {
				if(amount !=0) {
				 balance -= amount;
							previousTranscation = -amount;
				}
			}
			void getpreviousTranscation () {
				if (previousTranscation > 0) {
				 System.out.println("Deposit: " + previousTranscation);	
					
				}
				else if (previousTranscation < 0)
				{
					System.out.println("withdraw : "+ Math.abs(previousTranscation));
				}
				
			else {
			         System.out.println("No transcation  occured");
			
		 }
	 }
	void showMenu() {
		char option ='\0';
		Scanner sc = new Scanner (System.in);
		System.out.println("WELLCOME "+ customerName);
		System.out.println("your ID is:"+customerID);
		System.out.println();
		System.out.println("A.checkBalance");
		System.out.println("B.Deposit");
		System.out.println("C.WITHDRAW");
		System.out.println("D.previous transcation");
		System.out.println("E.exit");
		
		
		do {
			System.out.println("---");
			System.out.println("enter the option");
			System.out.println("----");
			option = sc.next().charAt (0);
			
		switch (option) {
				case 'A':
				System.out.println("-----");
				System.out.println("Balance is: "+balance);
				System.out.println();
		break;
				case 'B':
				System.out.println("------");
				System.out.println("enter the amount to deposit");
				System.out.println("-------");
				int amount = sc.nextInt ();
				deposit(amount);
				System.out.println();
		break;
				case 'c':
					System.out.println("------");
					System.out.println("enter the amount to withdraw");
					System.out.println("----");
					int withdrawAmount = sc.nextInt();
					withdraw (withdrawAmount );
					System.out.println();
		break;
				case 'D':
					System.out.println("-----");
					getpreviousTranscation();
					System.out.println("------");
					System.out.println();
		break;
				case 'E':
				System.out.println("Exiting..");
		break;
		     default:
		    	 System.out.println("Invalid option ! please try again.");
		 break;
			  }
		} 
		while (option != 'E');
	}
  }
 }