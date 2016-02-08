package drt2009.CardDealing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import drt2009.CardDealing.Server.StandardDeckImpl;
import drt2009.CardDealing.Service.Card;
import drt2009.CardDealing.Service.StandardDeck;

public class StandardDeck_Test {

	private final int NUMBER_OF_CARDS_IN_DECK = 52;
	private StandardDeck deck = null;

	@Before
	public void setup() {
		deck = new StandardDeckImpl();
	}

	@Test
	public void constructor_Test() {
		assertEquals("Testing the deck set up with 52 cards.  ONLY VALID IF getNumberOfCardsLeft_Test PASSES", NUMBER_OF_CARDS_IN_DECK, deck.getNumberOfCardsLeft());
	}

	@Test
	public void draw_Test() {
		Card card = null;
		card = deck.draw();
		assertNotNull("Testing if a card was returned", card);

	}

	@Test
	public void getNumberOfCardsLeft_Test() {
		int cardsDrawn = 0;
		deck.draw();
		cardsDrawn++;
		deck.draw();
		cardsDrawn++;
		deck.draw();
		cardsDrawn++;
		deck.draw();
		cardsDrawn++;
		assertEquals("Checking cards are removed", NUMBER_OF_CARDS_IN_DECK - cardsDrawn, deck.getNumberOfCardsLeft());
	}

	@Test
	public void reshuffle_Test(){
		deck.draw();
		deck.draw();
		deck.draw();
		deck.draw();
		deck.reshuffle();
		assertEquals("Checking to make sure deck was shuffled.  ONLY VALID IF getNumberOfCardsLeft_Test PASSES" , NUMBER_OF_CARDS_IN_DECK , deck.getNumberOfCardsLeft());
	}
	@After
	public void cleanup() {
		deck = null;
	}

}
