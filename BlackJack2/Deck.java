import java.util.ArrayList;
import java.util.Collections;
public class Deck
{
    private ArrayList<Card> deck;
    public Deck ()
    {
        load ();
	shuffle ();
    }
    private void load ()
    {
        int i,j;
	deck=new ArrayList<Card> ();
	for (i=1;i<=4;++i)
	    for (j=1;j<=11;++j)
	        deck.add (new Card (j,i));
	        
    }
    private void shuffle ()
    {
        Collections.shuffle (deck);
    }
    public int next ()
    {
        int n;
	if (deck.size ()==0) {
	    load ();
	    shuffle ();
	}
	n=deck.get (0).getValue ();
	deck.remove (0);
	return (n);
    }
}
