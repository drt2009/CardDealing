package drt2009.CardDealing.Service;

public interface StandardDeck {
	public Card draw();
	public int getNumberOfCardsLeft();
	public void reshuffle();
}
