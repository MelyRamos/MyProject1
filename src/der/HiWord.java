package der;
import java.util.Scanner;

public class HiWord {
	public static void main(String[] args) {
		System.out.println("Hello Word");
		//calcular la media aritmetica
			  Scanner sc = new Scanner(System.in);
		      int n, sum = 0, x;

		      float media;

		      System.out.print("Ingrese la cantidad de números: ");

		      n = sc.nextInt();

		      System.out.println("Ingrese los números: ");

		      for (int i = 0; i < n; i++) {

		         x = sc.nextInt();

		         sum += x;

		      }

		      media = (float) sum / n;

		      System.out.println("La media aritmética es: " + media);

   }

}
