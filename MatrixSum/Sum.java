import java.util.Scanner;
public class Sum
{
    int sum;
    public Sum () {}
    public Sum (int[][] a)
    {
	set (sum (a));
    }
    public int get () {return (sum);}
    private void set (int a) {sum=a;}
    private int sum (int[][] a)
    {
        int i,j,t;
	i=j=t=0;
	for (i=0;i<a.length;++i)
	    for (j=0;j<a[i].length;++j)
		t+=a[i][j];
	return (t);
    }
    public int[][] read ()
    {
	Scanner s=new Scanner (System.in);
        int i,j,l,w;
	i=j=l=w=0;
	System.out.printf ("Input length and width, respectively.\n> ");
	try {
	    l=Integer.parseInt (s.next ());
	    System.out.printf ("> ");
	    w=Integer.parseInt (s.next ());
	} catch (Exception e) {
	    System.err.printf ("Input Fail\n");
	    return (null);
	}
	int[][] a=new int[l][w];
	for (i=0;i<l;++i)
            for (j=0;j<w;++j) {
		System.out.printf ("Input number at (%d,%d) > ",i,j);
	        try {
		    a[i][j]=Integer.parseInt (s.next ());
		} catch (Exception e) {
		    System.err.printf ("Input Fail\n");
		    return (null);
		}
	    }
	return (a);
    }
}
