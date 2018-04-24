import java.util.Scanner;

public class IlPiuAltoDi5 {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		
		int x = -999;
		
		int y = 0;
		
		for (int u = 0; u < 5; u = u + 1) {
			System.out.println("Inserisci un intero: ");
			y = tastiera.nextInt();
			
			if (y > x) {
				x = y;
			}
			
		}
		
		System.out.println("Il numero maggiore è " + x);
	}

}
