
public class HelloNumbersAndOperators {

	public static void main(String[] args) {
		int a;
		a = 10;
		
		int b = 30;
		
		int c = a + b;
		
		System.out.println(c);
		
		double n = 5.67;
		double t = 3.1415;
		System.out.println(n + t);
		
		
		float p = 45.79f;
		float l = 4.888f;
		System.out.println(p + l);
		
		int r = 10 / 3;
		System.out.println(r);
		
		
		double k = 10 / 3.0;
		double u = 10 / 3;
		System.out.println(k);
		
		boolean j = true;
		boolean z = false;
		boolean h = j || z; // OR logico
		boolean x = j && h; // AND logico
		boolean y = ! z; // NOT logico
		
		boolean w = ! (h && x);
		System.out.println(w);
		
		boolean q = (k == u);
		System.out.println(q);
	}

}
