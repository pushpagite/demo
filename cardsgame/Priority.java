package cardsgame;
//Card Priority is [A, King, Queen, Jack, 10,9 ,8,7,6,5,4,3,2]
public enum Priority
{
	TWO(1), THREE(2), FOUR(3), FIVE(4), SIX(5),
	SEVEN(6), EIGHT(7), NINE(8), TEN(9), JACK(10),
	QUEEN(11), KING(12), ACE(13);
	
	// Private fields
	private final int rankValue;
	
	// Constructor
	private Priority(int rankValue)
	{
		this.rankValue = rankValue;
	}
	
	/**
	 * Method getRank
	 * @return rank value
	 */
	public int getPriority()
	{
		return rankValue;
	}
}
