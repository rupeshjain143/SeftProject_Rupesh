
public class fibonancci {

	public static void main(String[] args) {

		int num = 10;
		int a = 0;
		int b = 1;

		for (int i = 0; i < num; i++) {
			int c = a + b;
			b = a;
			a = c;
			System.out.println(c);
		}

	}
}
