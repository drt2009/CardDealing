package drt2009.CardDealing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import drt2009.CardDealing.Server.CardImpl;
import drt2009.CardDealing.Server.HandImpl;
import drt2009.CardDealing.Server.Suit;
import drt2009.CardDealing.Server.Value;
import drt2009.CardDealing.Service.Card;
import drt2009.CardDealing.Service.Hand;

public class Hand_Test {

	private final Card TEST_CARD = new CardImpl(Suit.Clubs, Value.King);
	private Hand hand;

	@Before
	public void setup() {
		hand = new HandImpl();
	}

	@Test
	public void addCard_and_getCard_Test() {
		final int NUMBER_OF_CARDS = 1;
		hand.addCard(TEST_CARD);
		assertEquals("Testing there is one card in the hand", NUMBER_OF_CARDS, hand.getCards().size());
	}

	@Test
	public void getNumberOfCards_Test() {
		int cardsAdded = 0;
		hand.addCard(TEST_CARD);
		cardsAdded++;
		hand.addCard(TEST_CARD);
		cardsAdded++;
		hand.addCard(TEST_CARD);
		cardsAdded++;
		hand.addCard(TEST_CARD);
		cardsAdded++;
		assertEquals("Testing cards count of the cards added to the hand. ONLY WORKS IF ADD CARD WORKS", cardsAdded, hand.getNumberOfCards());
	}
	
	@Test
	public void reset_Test(){
		hand.addCard(TEST_CARD);
		hand.addCard(TEST_CARD);
		hand.addCard(TEST_CARD);
		hand.addCard(TEST_CARD);
		hand.reset();
		assertEquals("Testing reset after cards are added to the hand. ONLY WORKS IF ADD CARD WORKS", 0, hand.getCards().size());
	}

	@After
	public void cleanup() {
		hand = null;
	}

}
