package drt2009.CardDealing.Server;

import java.util.ArrayList;
import java.util.List;

import drt2009.CardDealing.Service.Card;
import drt2009.CardDealing.Service.Hand;

public class HandImpl implements Hand{

	List<Card> cards;
	
	public HandImpl(){
		cards = new ArrayList<>();
	}
	
	@Override
	public void addCard(Card card) {
		cards.add(card);
	}

	@Override
	public int getNumberOfCards() {
		return cards.size();
	}

	@Override
	public void reset() {
		cards.removeAll(cards);
		
	}

	@Override
	public List<Card> getCards() {
		return cards;
	}

}
