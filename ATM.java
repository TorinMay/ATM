import java.util.Scanner;
import java.util.Arrays;

public class ATM {
	//State
	public String names[];
	private int pins[];
	private double balances[];

	public ATM() {
		getUsers();
	}

	public void getUsers() {
		names = new String[] {"Bob", "Alice", "JT"};
		pins = new int[]{1234, 3333, 0001};
		balances = new double[]{100.00, 250.00, 99999999.00};
	}

	public void login() {
		boolean matchFound = false;
		System.out.print("Please input account name: ");
		Scanner loginName = new Scanner(System.in);
		String name = loginName.nextLine();
		System.out.print("Please enter your pin #: ");
		Scanner loginPin = new Scanner(System.in);
		int pin = loginPin.nextInt();
		int i;
		for (i=0; i<names.length; i++) {
			if (name.equals(names[i]) && pin == pins[i]) {
				matchFound = true;
				break;
			}		
		}

		if (matchFound) {
			menu(i, name);
		}else {
			System.out.println("--------------------\nLogin failed incorrect account name or pin #. \n--------------------");
			login();
		}
	}
		
		

	public void menu(int index, String userName) {
	System.out.println("\nWelcome " + (userName) + "\n --------------------\nYour account balance is " + (balances[index]) + "\n --------------------\nWhat whould you like to do? \n ------------------------------- \n Changeyour account name? \n Press 1 \n -------------------- \n Make a withdraw\n Press 2 \n -------------------- \n Logout \n Press 3 \n ");
	System.out.print("Option: "); Scanner option = new Scanner(System.in); int
	choice = option.nextInt(); if(choice == 3) {
		logout(); 
	}else if(choice ==2) { 
		withdraw(index); 
	}else if(choice == 1) { 
		changeName(index);
	}

	public void logout() {
		System.out.println("Thank you for using Padjen banking ATM. You have been logged out.");
		System.exit(0);
	}
	public void changeName(int index) {
		System.out.print("Enter new name: ");
		Scanner input = new Scanner(System.in);
		String newName = input.nextLine();
		names[index] = newName;
		System.out.println("--------------------\nYour new name is " + newName);
		menu(index, names[index]);
	}
	
	public void withdraw(int index) {
		double amount;
		while (true)
		{
			System.out.println("Enter amount 0 to go back to menu.\n ---------------------");
			System.out.print("How much would you like to withdraw ($" + balances[index] + "): ");
			Scanner userInput = new Scanner(System.in);
			amount = userInput.nextDouble();
			if (amount > balances[index]) {
				System.out.println("Requested amount exceeds balance!");
			}
			else if (amount < 0){
				System.out.println("Invalid amount!");
			}
			else if (amount == 0) {
				menu(index, names[index]);
			}
			else{
				break;
			}
		}
		double newBalance = balances[index] - amount;
		System.out.println("Your new balance: " + newBalance);
		balances[index] = newBalance;
		menu(index, names[index]);
	}
}