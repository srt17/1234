import java.util.Scanner;

public class Hello2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.next();
		System.out.println("Hello "+ name);
		
		scan.close();

	}

}
