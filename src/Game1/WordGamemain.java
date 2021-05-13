package Game1;
import java.util.Scanner;
public class WordGamemain {

	public static void main(String[] args) {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("끝말잇기 게임을 시작합니다...");
		int Totnum = Player.StartGame();
		System.out.print("\n");
		String [] Playername = new String[Totnum];
		for (int i = 0 ; i < Totnum; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			Playername [i] = (String) sc2.next();
		}
		
		System.out.println("시작하는 단어는 아버지 입니다.");
		String word1 = "아버지";
		String Loser = null;
		int N = 1;
		for (int i = 0 ; i <Totnum; i++) {
			String word2 = Rule.run(Playername[i]);
			N = Rule.Rule1(word1,word2);
			if(N==0) {Loser = Playername[i]; break;}
			word1= word2;
			if( i == (Totnum-1)) {i=0;}
		}
		
		System.out.println("\n"+Loser+"이 졌습니다.");
		sc2.close();
	}
}
