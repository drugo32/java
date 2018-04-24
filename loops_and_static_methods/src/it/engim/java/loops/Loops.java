package it.engim.java.loops;

public class Loops {

	public static void main(String[] args) {

		
		for ( int i = 0; i < args.length; i = i + 1 ) {
			System.out.println( args[i] );
		}
		
		for ( int j = args.length - 1; j >= 0; j = j - 1 ) {
			System.out.println( args[j] );
		}
		
		
		for (String argomento : args) {
			System.out.println(argomento);
		}

		
		int x = 0;
		while (x < args.length) {
			
			System.out.println(args[x]);
			x++;
		}
		
		int t = 0;
		do {
			System.out.println(args[t]);
			t++;
		} while (t < args.length);
		
		
		int d = 10;
		if (d < 10) {
			System.out.println("Minore di dieci.");
		} else {
			System.out.println("Maggiore di dieci.");

		}
		
		if (d < 10) {
			System.out.println("Minore di dieci.");
		} else if (d >= 10 && d < 100) {
			System.out.println("Compreso tra 10 e 99.");
		} 
		
		// L'ultimo ramo else è opzionale
		else {
			System.out.println("Maggiore o uguale a 100.");
		}
		
		
		switch (d) {
		case 10:
			System.out.println("Vale 10");
			break;
		case 11:
			System.out.println("Vale 11");
			break;

		default: // Opzionale
			System.out.println("Diverso da 10 e 11");
			break;
		} 
		
		String s = "Ciao mondo";
		s.split(" ");
		
		
	}

		
}
