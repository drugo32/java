import java.util.Scanner;

public class Esercizio11 {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci due interi: ");
		int x = tastiera.nextInt();
		int y = tastiera.nextInt();

		
		System.out.println("La somma è: " + (x + y));
		
		tastiera.close();

	}

}
