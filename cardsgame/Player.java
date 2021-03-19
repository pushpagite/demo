package cardsgame;

import java.util.ArrayList;

public class Player {
	String playerName;
	boolean isSameColor;
	boolean isSameNumber;
	
	Card inHandCard[]=new Card[3];

	public Player(String playerName) {
		this.playerName = playerName;
	}
	
	//method for displaying card
	public void showInhandCard()
	{
		for(int i=0;i<inHandCard.length;i++)
		{
			System.out.println(inHandCard[i]);
		}
	}

}
