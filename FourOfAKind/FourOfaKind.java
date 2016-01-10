
public class FourOfaKind {
	
	final static int HUMAN = 0;
	
	final static int COMPUTER = 1;

	public static void main(String[] args) 
	
	{
		
		System.out.println("Witaj w grze Kareta");
		Deck deck = new Deck();
		DiscardPile discardPile = new DiscardPile();
		Card hCard;
		Card cCard;
		
		while (true)
		
		{
			
			hCard = deck.deal();
			cCard = deck.deal();
			if(hCard.rank() != cCard.rank())
				break;
			
			deck.putBack(hCard);
			deck.putBack(cCard);
			deck.shuffle();
			
						
		}
		
		int curPlayer = HUMAN;
		
		if(cCard.rank().ordinal() > hCard.rank().ordinal())
			curPlayer = COMPUTER;
		
		deck.putBack(hCard);
		hCard = null;
		deck.putBack(cCard);
		cCard = null;
		Card[] hCards = new Card[4];
		Card[] cCards = new Card[4];
		if(curPlayer == HUMAN)
			for(int i = 0; i < 4; i++)
			
			{
				cCards[i] = deck.deal();
				hCards[i] = deck.deal();
			}
		else
				for (int i = 0; i < 4; i++)
				{
					hCards[i] = deck.deal();
					cCards[i] = deck.deal();
				}
		while(true)
		{
			if(curPlayer == HUMAN)
			
			{
				
				showHeldCards(hCards);
				int choice = 0;
				while(choice < 'A' || choice > 'D')
				
				{
					
					choice = prompt("Której karty chcesz siê pozbyæ ( A, B, " + "C, D) ?");
					
					switch (choice)
					
					{
					
					case 'a' : choice = 'A'; break;
					case 'b' : choice = 'B'; break;
					case 'c' : choice = 'C'; break;
					case 'd' : choice = 'D'; 
					
					}
				}
					discardPile.setTopCard(hCards[choice - 'A']);
					hCards[choice - 'A'] = deck.deal();
					if(isFourOfAKind(hCards))
					{
						System.out.println();
						System.out.println("Cz³oweik wygrywa");
						System.out.println();
						putDown("Karty Cz³owieka:", hCards);
						System.out.println();
						putDown("Karty Komputera:", cCards);
						return;
					}
					
					curPlayer = COMPUTER;
				}
				
				else
				{
					
					int choice = leastDesirableCard(cCards);
					discardPile.setTopCard(cCards[choice]);
					cCards[choice] = deck.deal();
					if(isFourOfAKind(cCards))
					
					{
						
						System.out.println();
						System.out.println("Komputer Wygrywa");
						System.out.println();
						putDown("Karty Komputera", cCards);
						return;
						
					}
				
					curPlayer = HUMAN;
				}
				
				if(deck.isEmpty())
				{
					while (discardPile.topCard() != null)
						deck.putBack(discardPile.getTopCard());
					deck.shuffle();
				}
												
			}}
			
			static boolean isFourOfAKind(Card[] cards)
			{
				for(int i = 0; i < cards.length; i++){
					if(cards[i].rank() != cards[0].rank())
						
					
						return false;
					}
					return true;
			
				
			}
			
			
			static int leastDesirableCard(Card[] cards)
			{
				int [] rankCounts = new int[13];
				for(int i = 0; i < cards.length; i++)
					rankCounts[cards[i].rank().ordinal()]++;
				int minCount = Integer.MAX_VALUE;
				int minIndex = -1;
				for(int i = 0; i < rankCounts.length; i++)
					if(rankCounts[i] < minCount && rankCounts[i] != 0)
					{
						minCount = rankCounts[i];
						minIndex = i;
						
					}
				for(int i = 0; i < cards.length; i++)
					if(cards[i].rank().ordinal() == minIndex)
						return i;
				return 0;
			
			}
			
			
			static int prompt(String msg)
			{
				System.out.print(msg);
				try
				{
					int ch = System.in.read();
					while (System.in.read() != '\n');
					return ch;
				
					
				}catch (java.io.IOException ioe)
				{
					
				}return 0;
			}
			
			static void putDown(String msg, Card[] cards)
			{
				System.out.println(msg);
				for(int i = 0; i < cards.length; i++)
					System.out.println(cards[i]);
			}
			
			static void showHeldCards(Card[] cards)
			{
				System.out.println();
				System.out.println("Posiadane karty:");
				for(int i = 0; i < cards.length; i++)
					if(cards[i] != null)
						System.out.println((char) ('A' + i) + "." + cards[i]);
				System.out.println();
			}
	

}
