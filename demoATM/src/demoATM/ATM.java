package demoATM;


import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		
		double balance = 100000,withdraw,deposit;
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("Automated Teller Machine\nChoose 1: for Withdraw\nChoose 2: for Deposit\nChoose 3: for Balance\nChoose 4: for Exit\nChoose the operation you want to perform:");
			
			
			int choice = scn.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the amount you want to Withdraw: ");
				withdraw = scn.nextDouble();
				if(balance >= withdraw) {
					balance = balance - withdraw;
					System.out.println("Please collect your memory");
				}else {
						System.out.println("Insufficient Balance");
					}
				break;
					
					case 2:
						System.out.println("Enter the Amount you want deposit: ");
						deposit = scn.nextDouble();
						balance = balance + deposit;
						System.out.println("Your Money has been successfully deposit");
						break;
						
							case 3:
								System.out.println("Balance:" + balance);
								System.out.println();
								break;
							
								case 4:
									
									System.exit(0);
						
						
			}//switch case
		}//while loop
		
	}

}

