public class Main
{
    public static void main (String[] args)
    {
        IO i=new IO ();
	Sum s=new Sum (i.read (">"));
	i.print (s.sum ());
    }
}
