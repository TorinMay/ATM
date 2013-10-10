import java.util.Scanner;

public class ATM {
	//State
	private String name;
	private int pin;
	private double balance;

	public ATM() {

	}

	
	public void user(String name, int pin, double balance) {
		String[] names = new Array{"Bob", "Alice", "JT"};
		int[] pins = new Array{1234, 3333, 0001};
		double[] balances = new Array{100.00, 250.00, 999999999.00};
	}
	public void checkBalance(double balance) {
		
	}

	public String login() {
		System.out.print("Please input account name: ");
		Scanner login = new Scanner(System.in);
		String name = login.nextLine();
		return name;
	}

	public void logout() {

	}
	// public String name() {
	// 	return name;
	// }
	// public String changeName() {
	// 	if (name.length() > 2 && name.length() < 20) {
	// 		this.name = name;
	// 	}
	// }
	
	// public int withDraw() {

	// }
}