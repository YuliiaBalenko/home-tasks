package task.test8;

import task.ITest;

public class TestCards implements ITest
{
	public String run()
	{
		Deck deck = new Deck();

		System.out.println("create deck");
		System.out.println("cards count = " + deck.getCount());
		System.out.println("shuffle");
		deck.shuffle();
		while (true)
		{

			System.out.println("get next card");
			Card card = deck.getNextCard();
			if(card == null)
				break;

			System.out.println("card = " + card.toString());
		}
		return "";
	}
}
