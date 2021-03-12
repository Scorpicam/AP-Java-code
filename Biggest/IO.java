import java.util.Scanner;
import java.util.ArrayList;
public class IO
{
    public IO () {}
    public int[][] read (String p)
    {
        int[][] r;
        System.out.printf ("Terminate row input with a newline\n");
	System.out.printf ("Terminate input with EOF\n");
	System.out.printf ("    (Windows: Ctrl-Z, Mac: Ctrl-D)\n");
	r=convert (input (p));
	return (r);
    }
    private ArrayList<ArrayList<Integer>> input (String p)
    {
        ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>> ();
	ArrayList<Integer> tmp=new ArrayList<Integer> ();
	Scanner str,inp=new Scanner (System.in);
	String s;
	int i;
	for (;;) {
	    System.out.printf ("%s ",p);
	    try {
	        s=inp.nextLine ();
            } catch (Exception e) {
		System.out.printf ("    \n");
	        return (a);
	    } str=new Scanner (s);
	    for (i=0;i<s.length ();++i) {
		try {
		    tmp.add (Integer.parseInt (str.next ()));
		} catch (Exception e) {
		    break;
		}
	    } a.add (tmp);
	    tmp=new ArrayList<Integer> ();
	}
    }
    private int[][] convert (ArrayList<ArrayList<Integer>> a)
    {
	int i,j;
	for (i=j=0;i<a.size ();++i) if (a.get (i).size ()>j) j=a.get (i).size ();
	int[][] r=new int[a.size ()][j];
	for (i=0;i<a.size ();++i)
            for (j=0;j<a.get (i).size ();++j)
		r[i][j]=a.get (i).get (j);
	return (r);
    }
    public void print (int[] a)
    {
        int i;
	System.out.printf ("[");
	for (i=0;i<a.length;++i) {
	    System.out.printf ("%d",a[i]);
	    if (i!=a.length-1) System.out.printf (", ");
	} System.out.printf ("]\n");
    }
    public void print2 (int[][] a)
    {
        int i,j;
	for (i=0;i<a.length;++i) {
	    for (j=0;j<a[i].length;++j)
		System.out.printf ("%d ",a[i][j]);
	    System.out.printf ("\n");
	}
    }
}
