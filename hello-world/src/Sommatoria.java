import java.util.Scanner;

public class Sommatoria {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		
		int x = 0;
		
		int y = 0;
				
		for (int u = 0; u < 5; u = u + 1) {
			System.out.println("Inserisci un intero: ");
			y = tastiera.nextInt();
			
			x = x + y;
			
		}
		
		System.out.println("La somma è " + x);
	}

}