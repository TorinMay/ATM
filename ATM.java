import java.util.Scanner;

public class ATM {
	//MAIN
	private User active;
	private User testAccount1 = user(Bob, 1234, 100.00);
	private User testAccount2 = user(Alice, 3333, 250.00);
	private User testAccount3 = user(JT, 0001, 999999999.00);

	public void user(String name, int pin, double balance) {
		
	}
	public void checkBalance(double balance) {
		
	}

	public static String login() {
		System.out.print("Please input account name: ");
		Scanner login = new Scanner(System.in);
		String name = login;
		return name;
	}

	public void logout() {

	}

	public String changeName() {

	}
	
	public int withDraw() {

	}

	public static void main(String[] args) {
		login();
	}
}