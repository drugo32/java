import java.util.Scanner;

public class Esercizio12 {

	public static void main(String[] args) {
			
			Scanner tastiera = new Scanner(System.in);
			
			System.out.println("Inserisci due numeri: ");
			double x = tastiera.nextDouble();
			double y = tastiera.nextDouble();

			
			System.out.println("La somma è: " + (x + y));
			
			tastiera.close();

	}

}
