import java.util.Scanner;

public class InputDaTastiera {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci un intero: ");
		int x = tastiera.nextInt();
		
		System.out.println("Inserisci un double: ");
		double y = tastiera.nextDouble();
		
		System.out.println("Inserisci una stringa: ");
		String z = tastiera.next();
		
		tastiera.close();
	}

}
