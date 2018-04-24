import java.util.Scanner;

public class Esercizio08 {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci tre interi: ");
		String x = tastiera.next();
		String y = tastiera.next();
		String z = tastiera.next();
		
		System.out.println("Hai inserito: " + x +"-"+ y +"-"+ z);
		
		tastiera.close();

	}

}
