package drt2009.CardDealing.Server;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Suit_Test {

	@Test
	public void getSuit_HeartsTest() {
		assertEquals("Checking the Hearts suits are the same", "Hearts", Suit.Hearts.getSuit());
	}

	@Test
	public void getSuit_DiamondsTest() {
		assertEquals("Checking the Diamonds suits are the same", "Diamonds", Suit.Diamonds.getSuit());
	}

	@Test
	public void getSuit_SpadesTest() {
		assertEquals("Checking the Spades suits are the same", "Spades", Suit.Spades.getSuit());
	}

	@Test
	public void getSuit_ClubsTest() {
		assertEquals("Checking the Clubs suits are the same", "Clubs", Suit.Clubs.getSuit());
	}

}
