
public class HelloArray {

	public static void main(String[] args) {
		
		System.out.println("L'utente ha inserito " + args.length + " valori.");
		
		double[] money = new double[3];
		
		money[0] = Double.parseDouble(args[0]);
		money[1] = Double.parseDouble(args[1]);
		money[2] = Double.parseDouble(args[2]);
		
		System.out.println(money[0]);
		System.out.println(money[1]);
		System.out.println(money[2]);
		
		
		
	}

}
