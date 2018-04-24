import java.util.Scanner;

public class InputArray {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);

		System.out.println("Inserisci un numero: ");
		int lunghezza = tastiera.nextInt();
		
		int[] array = new int[lunghezza];
		
		System.out.println("Verifica: " + array.length);
		
		tastiera.close();
	}

}
