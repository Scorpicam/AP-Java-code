public class Main
{
    public static void main (String[] args)
    {
        Io i=new Io ();
	Maze m=new Maze ();
	boolean[][] a=i.read ();
	System.out.printf ("\n");
	i.print ();
	System.out.printf ("exit%s found\n",m.prufen (a)?"":" not");
    }
}
