enum card_t
{
    ACE (11),TWO (2),THREE (3),FOUR (4),FIVE (5),
    SIX (6),SEVEN (7),EIGHT (8),NINE (9),TEN (10),
    JACK (10),QUEEN (10),KING (10),NIL (0);
    private int value;
    public int getvalue () { return (value); }
    public card_t retval (int i)
    {
        for (card_t a:card_t.values ())
	    if (a.getvalue ()==i) return (a);
	return (card_t.NIL);
    }
    private card_t (int v) { value=v; }
}
enum suit_t
{
    NIL (0),CLUBS (1),DIAMONDS (2),HEARTS (3),SPADES (4);
    private int value;
    public int getvalue () { return (value); }
    public suit_t retval (int i)
    {
        for (suit_t a:suit_t.values ())
	    if (a.getvalue ()==i) return (a);
	return (suit_t.NIL);
    }
    private suit_t (int v) { value=v; }
}
public class Card
{
    card_t c;
    suit_t s;
    public Card (int a,int b)
    {
        c=c.retval (a);
	s=s.retval (b);
    }
    public Card () { this (0,0); }
    public int getValue () { return (c.getvalue ()); }
    public int getSuit () { return (s.getvalue ()); }
    public String strValue () { return (c.toString ()); }
    public String strSuit () { return (s.toString ()); }
    public static int rand () { return ((int)(Math.random ()*11)+1); }
}
