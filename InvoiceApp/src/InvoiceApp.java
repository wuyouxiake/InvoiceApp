import java.util.*;

public class InvoiceApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[] price = new double[1000];
		int i = 0, j;
		double sum = 0;
		System.out.print("Tax rate? :");
		double tax_rate = in.nextDouble();
		System.out.println();
		do {
			System.out.print("Price #" + (i + 1) + " :");
			price[i] = in.nextDouble();
			i++;
			sum += price[i - 1];

		} while (price[i - 1] != 0.0);
		System.out.println();

		System.out
				.println("----------------------------------------------------------------");
		System.out.println("Receipt");
		for (j = 0; j < i - 1; j++) {
			System.out.println(price[j]);
		}
		System.out.println(sum + " subtotal");
		System.out.println(sum * tax_rate + " tax");
		System.out.println((sum + sum * tax_rate) + " grand total");
	}
}