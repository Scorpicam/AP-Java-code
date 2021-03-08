public class Main
{
    public static void main (String[] args)
    {
        Sum a,b;
	a=new Sum ();
	b=new Sum (a.read ());
	System.out.printf ("%d\n",b.get ());
    }
}
