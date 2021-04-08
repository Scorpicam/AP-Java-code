public class Main
{
    public static void main (String[] args)
    {
        Chicken c=new Chicken ();
	if (args.length!=1) System.exit (0);
	System.out.printf ("%d\n",c.count (args[0]));
    }
}
