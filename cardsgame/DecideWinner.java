package cardsgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DecideWinner {

	// Method for finding the winner with highest points
	public void checkWinner(Player[] playerArr1) {
		Map<String, Integer> map = new HashMap<>();
		Player[] playerArr=   selectMode(playerArr1);
		for (Player player : playerArr) {

			int cnt = 0;
			for (int i = 0; i < 3; i++) {
				cnt += player.inHandCard[i].getValue();
			}
			map.put(player.playerName, cnt);

		}

		// Finding Max Key-value pair
		Map.Entry<String, Integer> maxEntry = null;

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
				maxEntry = entry;
			}
		}

		System.out.println("Winner with maximum points :" + maxEntry.getKey());

	}

	public Player[] selectMode(Player PlayerArr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Any Card Joker \n2.Low Card Joker \n3.High Card Joker");
		System.out.println("Please select mode");
		int mode = sc.nextInt();
		switch (mode) {
		case 1:
			for(int i=0;i<PlayerArr.length;i++)
			{   System.out.println("hello "+PlayerArr[i].playerName+" your turn " );
				PlayerArr[i].showInhandCard();
				System.out.println("Enter whcich card you want to make as joker 1-3");
				
				
				
			}
			break;
		case 2:
			System.out.println("you have enterd  Low Card Joker mode");
			for(int i=0;i<PlayerArr.length;i++)
			{   System.out.println("hello "+PlayerArr[i].playerName+" your turn " );
				PlayerArr[i].showInhandCard();
				System.out.println("Enter whcich card you want to make as joker 1-3");
				int no=sc.nextInt();
				
				replaceCard(PlayerArr, no );
			}
			
			break;
		case 3:
			System.out.println("you have enterd  hign  Card Joker mode");
			for(int i=0;i<PlayerArr.length;i++)
			{   System.out.println("hello "+PlayerArr[i].playerName+" your turn " );
				PlayerArr[i].showInhandCard();
				System.out.println("Enter whcich card you want to make as joker 1-3");
			}
			break;
			

		default: System.out.println("You have enter wrong mode..");
			break;
		}
		return PlayerArr;

	}

	public void replaceCard(Player[] playerArr, int no) {
		// TODO Auto-generated method stub
		
	}

	// Finding Same Number Card
	public boolean checkSameNumberCard(Player playerArr[]) {
		boolean flag = true;
		for (Player player : playerArr) {
			flag = true;
			for (int i = 0; i < 3; i++) {
				for (int j = 1; j < 3; j++) {
					if (player.inHandCard[i].getValue() != player.inHandCard[j].getValue()) {
						flag = false;
						break;

					}
				}

			}
		}
		return flag;

	}

	// Checking Same Color
	public boolean checkSameColor(Player playerArr[]) {
		boolean flag = true;
		for (Player player : playerArr) {
			flag = true;
			for (int i = 0; i < 3; i++) {
				for (int j = 1; j < 3; j++) {
					if (!(player.inHandCard[i].getCardSuit().equals(player.inHandCard[j].getCardSuit()))) {
						flag = false;
						break;
					}
				}

			}
		}
		return flag;

	}

	// Finding Sequence without Color

	public boolean checkSequenceWithoutColor(Player player) {
		boolean flag = true;

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (Card card : player.inHandCard) {
			al.add(card.getValue());
		}

		System.out.println(al);
		flag = true;
		for (int i = 0; i < 2; i++) {

			if (!(al.get(i + 1) - al.get(i) == 1)) {
				flag = false;
				break;
			}

		}

		return flag;

	}

}
