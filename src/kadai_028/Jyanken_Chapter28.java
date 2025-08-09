package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.print("自分のじゃんけんの手を入力しましょう\n"
					+ "グーはrockのrを入力しましょう\n"
					+ "チョキはscissorsのsを入力しましょう\n"
					+ "パーはpaperのpを入力しましょう ");

			String choice = scanner.nextLine();

			if (choice.equals("r") || choice.equals("s") || choice.equals("p")) {
				return choice;
			} else {
				System.out.println("⚠ 入力が間違っています。r, s, p のいずれかを半角小文字で入力してください。");
			}

		}

	}

	public String getRandom() {

		int num = (int) Math.floor(Math.random() * 3);

		switch (num) {
		case 0:
			return "r";
		case 1:
			return "s";
		case 2:
			return "p";
		default:
			return "";
		}

	}

	public void playGame() {
		HashMap<String, String> rspMap = new HashMap<>();
		rspMap.put("r", "グー");
		rspMap.put("s", "チョキ");
		rspMap.put("p", "パー");

		String player = getMyChoice();
		String computer = getRandom();

		System.out.println("あなたの手は " + rspMap.get(player));
		System.out.println("コンピュータの手は " + rspMap.get(computer));
		System.out.print("結果は…");

		if (player.equals(computer)) {
			System.out.println(" あいこです");
		} else if ((player.equals("r") && computer.equals("s")) ||
				(player.equals("s") && computer.equals("p")) ||
				(player.equals("p") && computer.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else if ((player.equals("r") && computer.equals("p")) ||
				(player.equals("s") && computer.equals("r")) ||
				(player.equals("p") && computer.equals("s"))) {
			System.out.println("自分の負けです");

		} else {
			System.out.println("正しく処理が行われませんでした");
		}

	}

}
