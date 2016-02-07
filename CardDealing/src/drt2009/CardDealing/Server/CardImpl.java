package drt2009.CardDealing.Server;

import drt2009.CardDealing.Service.Card;

public class CardImpl implements Card {

	private Suit suit;
	private Value value;
	
	public CardImpl(Suit suit, Value value){
		this.suit = suit;
		this.value = value;
	}
	
	@Override
	public String getSuitAsString() {
		return this.suit.getSuit();
	}

	@Override
	public String getValueAsString() {
		return this.value.getValue();
	}

	@Override
	public Suit getSuit() {
		return this.suit;
	}

	@Override
	public Value getValue() {
		return this.value;
	}

}
