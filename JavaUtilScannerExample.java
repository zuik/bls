import java.util.Scanner;

public class JavaUtilScannerExample {

	public static void main(String[] args) {
		// Create a Scanner object
		try (Scanner scanner = new Scanner(System.in)) {

			// Read values from Console

			// A String value
			System.out.print("Enter Item Code: ");
			String itemCode = scanner.next();

			// A double value
			System.out.print("Enter Price: ");
			double price = scanner.nextDouble();

			// An int value
			System.out.print("Enter Quantity: ");
			int quantity = scanner.nextInt();

			// Display entered values
			double total = price * quantity;
			System.out.println();
			System.out.printf("%d %s @ %f = %f", quantity, itemCode, price, total);

			// Read three int values
			System.out.printf("Enter three integer values: ");
			int i1 = scanner.nextInt();
			int i2 = scanner.nextInt();
			int i3 = scanner.nextInt();

			// Calculate the average and display the result
			int avg = (i1 + i2 + i3) / 3;

			System.out.printf("Average: %d", avg);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}
}
