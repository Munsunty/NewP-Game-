package Game1;
import java.util.Scanner;

public class Rule {
	static Scanner sc3 = new Scanner(System.in);
	

	public static String run(String name) {
		System.out.print(name +">>");
		String Word2 = sc3.nextLine();
		return Word2;
	}
	
	public static int Rule1(String word1, String word2){
		int lastIndex = word1.length()-1;
		char lastchar = word1.charAt(lastIndex);
		char fistchar = word2.charAt(0);
		if (lastchar != fistchar) {return 0;}
		
		else { return 1;	}
	}
	
}
