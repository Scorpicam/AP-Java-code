public class Main
{
    public static void main (String[] args)
    {
        IO i=new IO ();
	System.out.printf ("\nEnter matrix\n\n");
	int[][] a=i.read (">");
	Sum s=new Sum(a);
	System.out.printf ("\nEnter values to count\n\n");
	int[][] b=i.read (">");
	int k,j;
	i.print2 (a);
	for (k=0;k<b.length;++k)
            for (j=0;j<b[k].length;++j)
	        System.out.printf ("%d: %d\n",b[k][j],s.sum (b[k][j]));
    }
}
