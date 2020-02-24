package task.test8;

public class Card
{
	private String _rank;
	private String _suit;

	public Card(String rank, String suit)
	{
		_rank = rank;
		_suit = suit;
	}

	public String getRank()
	{
		return _rank;
	}

	public String getSuit()
	{
		return _suit;
	}

	public String toString()
	{
		return "Card{" + "rank=" + getRank() + ", suit='" + getSuit() + '\'' + '}';
	}
}
