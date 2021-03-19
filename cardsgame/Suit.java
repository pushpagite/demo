package cardsgame;
public enum Suit
{
	CLUBS("Clubs"),
	DIAMONDS("Diamonds"),
	HEARTS("Hearts"),
	SPADES("Spades");
	
	// Private fields
	private final String suitText;
	
	// Constructor
	Suit(String suitText)
	{
		this.suitText = suitText;
	}
	
	/**
	 * Method getSuit
	 * @return suit value
	 */
	public String getSuit()
	{
		return this.suitText;
	}
}
