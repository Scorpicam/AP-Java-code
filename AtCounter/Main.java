public class Main
{
    public static void main (String[] args)
    {
        int i,j;
	Matrix m=new Matrix ();
	At a=new At ();
	try {
	    i=Integer.parseInt (args[0]);
	    j=Integer.parseInt (args[1]);
	} catch (Exception e) {
	    i=j=0;
	} m.print ();
	System.out.printf ("%d\n",a.follow (m,i,j));
    }
}
