package drt2009.CardDealing;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import drt2009.CardDealing.Server.CardImpl;
import drt2009.CardDealing.Server.Suit;
import drt2009.CardDealing.Server.Value;
import drt2009.CardDealing.Service.Card;

public class Card_Test {

	private Card card = null;
	private final String TEST_SUIT = Suit.Hearts.getSuit();
	private final String TEST_VALUE = Value.Ace.getValue();

	@Before
	public void setup() {
		card = new CardImpl(Suit.Hearts, Value.Ace);
	}

	@Test
	public void getSuit_Test() {
		assertEquals("Testing to make sure it returns the correct suit", Suit.Hearts, card.getSuit());
	}

	@Test
	public void getValue_Test() {
		assertEquals("Testing to make sure it returns the correct value", Value.Ace, card.getValue());
	}

	@Test
	public void getSuitAsString_Test() {
		assertEquals("Testing to make sure it returns the correct suit as a string", TEST_SUIT, card.getSuitAsString());
	}

	@Test
	public void getValueAsString_Test() {
		assertEquals("Testing to make sure it returns the correct value as a string", TEST_VALUE, card.getValueAsString());
	}

	@After
	public void cleanup() {
		card = null;
	}

}
