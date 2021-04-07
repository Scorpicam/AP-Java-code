public class SpamWin
{
    public SpamWin (int t)
    {
        spam (t);
    }
    private void spam (int t)
    {
        if (t>0) {
            Gui g=new Gui (100*t,80*t);
	    spam (t-1);
	}
    }
}
