import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
	
	private Card[] cards = new Card[]
			 {
			 Card.AS_TREFL,
			 Card.DW�JKA_TREFL,
			 Card.TR�JKA_TREFL,
			 Card.CZW�RKA_TREFL,
			 Card.PI�TKA_TREFL,
			 Card.SZ�STKA_TREFL,
			 Card.SI�DEMKA_TREFL,
			 Card.�SEMKA_TREFL,
			 Card.DZIEWI�TKA_TREFL,
			 Card.DZIESI�TKA_TREFL,
			 Card.WALET_TREFL,
			 Card.KR�LOWA_TREFL,
			 Card.KR�L_TREFL,
			 Card.AS_KARO,
			 Card.DW�JKA_KARO,
			 Card.TR�JKA_KARO,
			 Card.CZW�RKA_KARO,
			 Card.PI�TKA_KARO,
			 Card.SZ�STKA_KARO,
			 Card.SI�DEMKA_KARO,
			 Card.�SEMKA_KARO,
			 Card.DZIEWI�TKA_KARO,
			 Card.DZIESI�TKA_KARO,
			 Card.WALET_KARO,
			 Card.KR�LOWA_KARO,
			 Card.KR�L_KARO,
			 Card.AS_KIER,
			 Card.DW�JKA_KIER,
			 Card.TR�JKA_KIER,
			 Card.CZW�RKA_KIER,
			 Card.PI�TKA_KIER,
			 Card.SZ�STKA_KIER,
			 Card.SI�DEMKA_KIER,
			 Card.�SEMKA_KIER,
			 Card.DZIEWI�TKA_KIER,
			 Card.DZIESI�TKA_KIER,
			 Card.WALET_KIER,
			 Card.KR�LOWA_KIER,
			 Card.KR�L_KIER,
			 Card.AS_PIK,
			 Card.DW�JKA_PIK,
			 Card.TR�JKA_PIK,
			 Card.CZW�RKA_PIK,
			 Card.PI�TKA_PIK,
			 Card.SZ�STKA_PIK,
			 Card.SI�DEMKA_PIK,
			 Card.�SEMKA_PIK,
			 Card.DZIEWI�TKA_PIK,
			 Card.DZIESI�TKA_PIK,
			 Card.WALET_PIK,
			 Card.KR�LOWA_PIK,
			 Card.KR�L_PIK
			 };
	
	private List<Card> deck;
	
	public Deck(){
		
		deck = new ArrayList<Card>();
		for(int i = 0; i < cards.length; i++){
			
			deck.add(cards[i]);
			cards[i] = null;
			
		}
		Collections.shuffle(deck);
	}
	
	public Card deal(){
		
		return deck.remove(0);
	}
	
	public boolean isEmpty(){
		
		return deck.isEmpty();
	}
	
	public void putBack(Card card){
		
		deck.add(card);
	}
	
	public void shuffle(){
		Collections.shuffle(deck);
	}

}
