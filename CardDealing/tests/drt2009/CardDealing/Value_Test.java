package drt2009.CardDealing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drt2009.CardDealing.Server.Value;

public class Value_Test {

	@Test
	public void getValue_AceTest() {
		assertEquals("Testing the get value of the Ace Card Value", "Ace", Value.Ace.getValue());

	}

	@Test
	public void getValue_TwoTest() {
		assertEquals("Testing the get value of the Two Card Value", "Two", Value.Two.getValue());

	}

	@Test
	public void getValue_ThreeTest() {
		assertEquals("Testing the get value of the Three Card Value", "Three", Value.Three.getValue());

	}

	@Test
	public void getValue_FourTest() {
		assertEquals("Testing the get value of the Four Card Value", "Four", Value.Four.getValue());

	}

	@Test
	public void getValue_FiveTest() {
		assertEquals("Testing the get value of the Five Card Value", "Five", Value.Five.getValue());

	}

	@Test
	public void getValue_SixTest() {
		assertEquals("Testing the get value of the Six Card Value", "Six", Value.Six.getValue());

	}

	@Test
	public void getValue_SevenTest() {
		assertEquals("Testing the get value of the Seven Card Value", "Seven", Value.Seven.getValue());

	}

	@Test
	public void getValue_EightTest() {
		assertEquals("Testing the get value of the Eight Card Value", "Eight", Value.Eight.getValue());

	}

	@Test
	public void getValue_NineTest() {
		assertEquals("Testing the get value of the Nice Card Value", "Nine", Value.Nine.getValue());

	}

	@Test
	public void getValue_TenTest() {
		assertEquals("Testing the get value of the Ten Card Value", "Ten", Value.Ten.getValue());

	}

	@Test
	public void getValue_JackTest() {
		assertEquals("Testing the get value of the Jack Card Value", "Jack", Value.Jack.getValue());

	}

	@Test
	public void getValue_QueenTest() {
		assertEquals("Testing the get value of the Queen Card Value", "Queen", Value.Queen.getValue());

	}

	@Test
	public void getValue_KingTest() {
		assertEquals("Testing the get value of the King Card Value", "King", Value.King.getValue());

	}

}
