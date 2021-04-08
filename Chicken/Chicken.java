public class Chicken
{
    public Chicken () {}
    public int count (String s)
    {
	s=s.toLowerCase ();
        return (r (s,0));
    }
    private int r (String s,int i)
    {
        if (!s.contains ("chicken")) return (i);
	s=s.replaceFirst ("chicken","");
	return (r (s,i+1));
    }
}
