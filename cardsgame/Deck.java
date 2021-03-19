package cardsgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	ArrayList<Card> deck = new ArrayList<>();
	//private int currentCard;

	// Constructor
	public Deck() {

	}

	// fills the card
	public void fillCard() {

		for (Suit suit : Suit.values()) {
			for (Priority priority : Priority.values()) {
				deck.add(new Card(priority, suit, priority.getPriority()));

			}
		}
	}

	// shuffles the card
	public ArrayList<Card> shuffle() {

		Collections.shuffle(deck);
		return deck;

	}

}
