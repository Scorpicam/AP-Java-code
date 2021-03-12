public class Main
{
    public static void main (String[] args)
    {
        IO i=new IO ();
	System.out.printf ("\nEnter matrix\n\n");
	int[][] a=i.read (">");
	Big s=new Big(a);
	i.print2 (a);
	System.out.printf ("Biggest: %d\n",s.cmp ());
    }
}
