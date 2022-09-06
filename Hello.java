
public class Hello {

	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Please enter one command line arg");
			return;
		}
		
		System.out.println("Hello "+ args[0]);
	}

}
