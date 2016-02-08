package drt2009.CardDealing.Service;

import java.util.List;

public interface Hand {
	public void addCard(Card card);
	public int getNumberOfCards();
	public void reset();
	public List<Card> getCards();
}
