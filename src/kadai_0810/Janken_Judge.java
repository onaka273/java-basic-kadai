package kadai_0810;

import java.util.HashMap;

public class Janken_Judge {
	
	public enum Result {
	    WIN, LOSE, DRAW
	}
	
	public Result playGame(String playerHand, String computerHand) {
	
		HashMap<String, String> jyanken = new HashMap<>();
		jyanken.put("r", "グー");
		jyanken.put("s", "チョキ");
		jyanken.put("p", "パー");

		System.out.println("自分の手は" + jyanken.get(playerHand) + ",対戦相手の手は" + jyanken.get(computerHand));

		if ((playerHand.equals("r") && computerHand.equals("s"))
				|| (playerHand.equals("s") && computerHand.equals("p"))
				|| (playerHand.equals("p") && computerHand.equals("r"))) {
			System.out.println("今回の試合結果：" + Result.WIN);
			return Result.WIN;
		} else if ((playerHand.equals("r") && computerHand.equals("p"))
				|| (playerHand.equals("s") && computerHand.equals("r"))
				|| (playerHand.equals("p") && computerHand.equals("s"))) {
			System.out.println("今回の試合結果：" + Result.LOSE);
			return Result.LOSE;
		} else {
			System.out.println("今回の試合結果：" + Result.DRAW);
			return Result.DRAW;
		}

		
		
	}
}
