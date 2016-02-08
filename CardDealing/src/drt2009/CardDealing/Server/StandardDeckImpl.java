package drt2009.CardDealing.Server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import drt2009.CardDealing.Service.Card;
import drt2009.CardDealing.Service.StandardDeck;

public class StandardDeckImpl implements StandardDeck{

	List<Card> cards;
	public StandardDeckImpl(){
		setupCards();
	}
	
	@Override
	public Card draw() {
		Card drawnCard = cards.remove(0);
		return drawnCard;
	}

	@Override
	public int getNumberOfCardsLeft() {
		return cards.size();
	}
	
	@Override
	public void reshuffle(){
		setupCards();
	}
	
	private void setupCards(){
		cards = new ArrayList<>();
		for (Suit suit : Suit.values()){
			for(Value value : Value.values()){
				cards.add(new CardImpl(suit,value));
			}
		}
		Collections.shuffle(cards);
	}

}
