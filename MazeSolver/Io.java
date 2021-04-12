import java.util.Scanner;
public class Io
{
    private boolean[][] a;
    public Io () {}
    public boolean[][] read ()
    {
        int i,j,t;
	Scanner s=new Scanner (System.in);
	t=s.nextInt ();
	a=new boolean[t][t];
	for (i=0;i<t;++i)
	    for (j=0;j<t;++j)
		a[i][j]=s.nextInt ()==1?true:false;
	return (a);
    }
    public void print ()
    {
        int i,j;
	for (i=0;i<a.length;++i)
	    for (j=0;j<a[i].length;++j) {
	        System.out.printf ("%d ",a[i][j]?1:0);
		if (j==a[i].length-1) System.out.printf ("\n");
	    }
    }
}
