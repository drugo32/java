import java.util.Scanner;

public class Esercizio13 {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci la tua altezza: ");
		double x = tastiera.nextDouble();
		
		System.out.println("Inserisci il tuo peso: ");
		double y = tastiera.nextDouble();

		
		System.out.println("Il tuo indice di massa corporea è: " + (y / (x*x)));
		
		tastiera.close();

	}

}
