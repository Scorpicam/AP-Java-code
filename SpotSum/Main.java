public class Main
{
    public static void main (String[] args)
    {
        System.out.printf ("Enter Matrix for location\n");
        IO i=new IO ();
	int[][] a=i.read (">");
	Sum s=new Sum (a);
	System.out.printf ("Enter coordinates\n");
	int[][] c=i.read (">");
	int k;
	i.print2 (a);
	for (k=0;k<c.length;++k)
	    System.out.printf ("(%d,%d) = %d\n",c[k][0],c[k][1],
			    s.sum (c[k][0],c[k][1]));
    }
}
