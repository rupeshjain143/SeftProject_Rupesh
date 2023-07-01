import java.util.Scanner;

public class PrimeNo1 {

	public static void main(String[] args) {
		System.out.println("Enter the Number >> ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		// int num = 10;
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("This Number Not Prime ");
		} else {
			System.out.println("This Number Is Prime ");
		}

	}
}
