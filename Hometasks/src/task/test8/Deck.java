package task.test8;

import java.util.Collections;
import java.util.Vector;

public class Deck
{
	static final String SUIT_HEARTS = "hearts";
	static final String SUIT_DIAMONDS = "diamonds";
	static final String SUIT_SPADES = "spades";
	static final String SUIT_CLUBS = "clubs";

	static final String RANK_CLUBS_6 = "6";
	static final String RANK_CLUBS_7 = "7";
	static final String RANK_CLUBS_8 = "8";
	static final String RANK_CLUBS_9 = "9";
	static final String RANK_CLUBS_10 = "10";
	static final String RANK_CLUBS_JACK = "Jack";
	static final String RANK_CLUBS_QUEEN = "Queen";
	static final String RANK_CLUBS_KING = "King";
	static final String RANK_CLUBS_ACE = "Ace";

	private Vector<Card> _cards = new Vector<Card>();

	public Deck()
	{
		reset();
	}

	public void reset()
	{
		_cards = new Vector<Card>();
		addCard(RANK_CLUBS_6);
		addCard(RANK_CLUBS_7);
		addCard(RANK_CLUBS_8);
		addCard(RANK_CLUBS_9);
		addCard(RANK_CLUBS_10);
		addCard(RANK_CLUBS_JACK);
		addCard(RANK_CLUBS_QUEEN);
		addCard(RANK_CLUBS_KING);
		addCard(RANK_CLUBS_ACE);
	}

	public void shuffle()
	{
		Collections.shuffle(_cards);
	}

	public int getCount()
	{
		return _cards.size();
	}

	public Card getNextCard()
	{
		if(_cards.size() == 0)
		{
			System.out.println("Deck is empty");
			return null;
		}

		Card card = _cards.firstElement();
		_cards.removeElementAt(0);
		return card;
	}

	private void addCard(String rank)
	{
		_cards.add(new Card(rank, SUIT_HEARTS));
		_cards.add(new Card(rank, SUIT_DIAMONDS));
		_cards.add(new Card(rank, SUIT_SPADES));
		_cards.add(new Card(rank, SUIT_CLUBS));
	}
}
