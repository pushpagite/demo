package cardsgame;

public class Card {
	// Private fields
	private Suit suit;
	private Priority priority;
	private int value;

	// Constructor
	public Card(Priority priority, Suit suit, int value) {
		this.priority = priority;
		this.suit = suit;
		this.value = value;
	}

	/************************************
	 * PUBLIC METHODS
	 ************************************/

	/**
	 * Method getCardSuit()
	 * 
	 * @return suit of card
	 */
	public String getCardSuit() {
		return suit.getSuit();
	}

	/**
	 * Method getCardPriority()
	 * 
	 * @return rank of card
	 */
	public int getCardRank() {
		return priority.getPriority();
	}

	/**
	 * Method getValue()
	 * 
	 * @return integer holding value for instance variable _value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Method setValue() sets instance variable value to passed value parameter
	 * 
	 * @param int value
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * Method toString()
	 * 
	 * @return suit and rank of card as a string
	 */
	@Override
	public String toString() {
		return "Card [suit=" + suit + ", priority=" + priority + ", value=" + value + "]";
	}

}// end Card
