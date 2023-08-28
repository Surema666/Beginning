import java.util.Scanner;
public class helloWorld {

	public static void main(String[] rags) {
		int counter = 1;
		int userVar = 0;
		boolean x = true;
		Scanner basic = new Scanner(System.in);
		String name;
		
		System.out.println("Enter name");
		
		name = basic.nextLine();
		System.out.println("Enter Loop number");
		userVar = basic.nextInt();
		
		while (counter <= userVar) {
			System.out.println("hello");
			counter++;
		}
		
		//or
		
		for (counter = 1, x = true;counter <= userVar && x == true;counter++) {
			System.out.println("world");
			if(counter == 3) {
				x = false;
			}
		}
		System.out.println(counter);
		System.out.println(name);
		
	}

}
