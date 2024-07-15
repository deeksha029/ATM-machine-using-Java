package ytd;
		import java.util.Scanner;
			public class Main {
			    
//		 		private static final  String PIN="1234";
				
			    public static void main(String[] args) {
			        
			        int balance = 5000, withdraw, deposit;
			        int defaultPin = 1234;
			        
			        Scanner sc= new Scanner(System.in);
			        System.out.println("enter the pin");
			        int pin = sc.nextInt();
			        
			        if(pin == defaultPin)
			        {
			        	while (true) {
				            System.out.println("-:Welcome To H ATM :-");
				            System.out.println("option 1 for Acc Balance");
				            System.out.println("option 2 for Withdraw");
				            System.out.println("option 3 for deposit");
				            System.out.println("option 4 for EXIT");
				            System.out.print("Choose the operation you want to perform:");
				            int choice = sc.nextInt();
				            switch (choice) {
				                case 1:
				                	System.out.println("Balance : " + " ₹ " + balance);
				                    System.out.println();
				                    break;


				                case 2:
				                	System.out.print("Enter money to be withdrawn:");
				                    withdraw = sc.nextInt();
				                    if (balance >= withdraw) {
				                        balance = balance - withdraw;
				                        System.out.println("Please collect your money");
				                        System.out.println("Remaining Balance is :" + " ₹ " + balance);
				                    } else {
				                        System.out.println("Insufficient Balance");
				                    }
				                    System.out.println();
				                    break;

				                 

				                case 3:
				                	System.out.print("Enter money to be deposited:");
				                    deposit = sc.nextInt();
				                    balance = balance + deposit;
				                    System.out.println(" ₹ " + deposit + " has been successfully deposited");
				                    System.out.println();
				                    break;

				                case 4:
				                    System.exit(0);
				                    // Make sure to add a break statement if you want to exit the switch block
				                    break;
				            }
			        	}
			        }
			    
			        
			    
			    else
			    {
			    	System.out.println("invalid pin");
			    }}}
			
			
	
