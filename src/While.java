import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		
		int a = sc.nextInt();
		
		System.out.println(a);
		imprime(a);
		imprime(valor(a));
		
		System.out.println("-------------------------");
		
		while (a > 0) {
			imprime(a);
			a--;
		}
		
		System.out.println("-------------------------");
		
		for (int f = 1; f < 5; f++) {
			imprime(f);
		}
		
		sc.close();
	}
	
	public static void imprime (int e) {
		System.out.println(e);
	}
	
	public static int valor (int e) {
		int k = 0;
		
		if (e > 10) {
			k = 100;
		}
		else {
			k = 10;
		}
		
		return k;
	}

}
