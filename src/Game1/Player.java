package Game1;
import java.util.Scanner;

public class Player {
	static Scanner sc1 = new Scanner (System.in);
	public static int StartGame() {
	
		System.out.print("게임에 참가하는 인원은 몇명입니까?");
		return TotalNum();
	}
	public static int TotalNum() {
		int TotNum = sc1.nextInt();
		return TotNum;
	}
	
	public static String Name() {

			System.out.print("참가자의 이름을 입력하세요>>");
			String Name = sc1.next();
			return Name;
	  	}
}