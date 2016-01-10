

public class DiscardPile {
	
	private Card[] cards;
	private int top;

	public DiscardPile(){
		
		cards = new Card[52];
		
		top = -1;
	}
	
	public Card getTopCard(){
		
		if(top == -1)
			return null;
		Card card = cards[top];
		cards[top--] = null;
		return card;
		
	}
	
	public void setTopCard(Card card){
		
		cards[++top] = card;
		
	}
	
	public Card topCard(){
		
		return (top == -1) ? null : cards[top];
	}
}
