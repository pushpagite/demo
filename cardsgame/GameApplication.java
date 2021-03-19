package cardsgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GameApplication {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//takes the no of player from user
		System.out.println("how many players you want ? ");
		int noOfPlayers = scanner.nextInt();
		Player player[] = new Player[noOfPlayers];
		for (int i = 0; i < noOfPlayers; i++) {
			System.out.println("enter player name");
			player[i] = new Player(scanner.next());
		}

		Deck d = new Deck();
		// cards will be filled 
		d.fillCard();
		
		//displays the cards before shuffling
		System.out.println(d.deck);

		//get the list of shuffled cards
		ArrayList<Card> shuffleCards = d.shuffle();
		//ArrayList<Card> shuffleCards = d.deck;
		System.out.println(d.deck);
		
		//Distribute 3  cards to each player
		int kcnt = 0;
		for (int k = 0; k < player.length; k++) {

			int cnt = 0;
			for (int tcnt = 0; cnt < 3; tcnt++) {

				player[k].inHandCard[tcnt] = shuffleCards.get(kcnt);
				cnt++;
				kcnt++;

			}
		}

	
//		for (int i = 0; i < player.length; i++) {
//			System.out.println(player[i].playerName);
//			player[i].showInhandCard();
//		}

		new DecideWinner().checkWinner(player);

	}

}
