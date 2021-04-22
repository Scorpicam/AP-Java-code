public class BlackJack
{
    private int score,first;
    private int host;
    public BlackJack ()
    {
        score=Card.rand ();
	first=Card.rand ();
	host=Card.rand ();
	display ();
    }
    public void hit ()
    {
        if (score!=-1) score+=Card.rand ();
	if (score>21) score=-1;
	hhost ();
    }
    private void hhost ()
    {
        for (;host!=-1&&host<16;host+=Card.rand ());
	if (host>21) host=-1;
    }
    public boolean winner ()
    {
        if (score==-1) return (false);
	if (score+first>21) return (false);
	return (score+first>host);
    }
    public void display ()
    {
	System.out.printf ("\t\tScore: ");
        if (score==-1) System.out.printf ("Bust\r");
	else System.out.printf ("%d\r",score);
    }
    public void show ()
    {
	System.out.printf ("Initial Card: %s\n",val (first));
        System.out.printf ("\t\tScore: ");
	if (score==-1) System.out.printf ("Bust");
	else if (score+first>21) System.out.printf ("Bust");
	else System.out.printf ("%d",score+first);
	System.out.printf ("\tHouse: ");
	if (host==-1) System.out.printf ("Bust\r");
	else System.out.printf ("%d\r",host);
    }
    private String val (Integer n)
    {
        switch (n) {
	case 11: return ("A");
	case 10: switch ((int)Math.random ()*2) {
		 case 0: return ("J");
		 case 1: return ("Q");
	         case 2: return ("K");
		 }
        default: return (n.toString ());
	}
    }
}
