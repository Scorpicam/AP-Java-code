import java.util.Scanner;
public class Fib
{
    private class Input
    {
        int ret;
	boolean flag;
	Scanner s;
	public Input ()
	{
	    ret = 0;
	    flag = false;
	    s = new Scanner (System.in);
	}
	public int getRet ()
	{
	    return (ret);
	}
	public boolean getFlag ()
	{
	    return (flag);
	}
	public Scanner getScan ()
	{
	    return (s);
	}
	public void setRet (int a)
	{
	    ret = a;
	}
	public void togFlag ()
	{
	    flag = flag ? false : true;
	}
    }
    public Fib ()
    {
        main (read ("max").getRet ());
    }
    public Fib (int max)
    {
        main (max);
    }
    private void main (int max)
    {
	Input n = new Input ();
        for (;;) {
	    n = read ("fib");
	    if (n.getFlag ()) {
		System.out.printf ("  \nGoodbye!\n");
	        break;
	    }
	    if (n.getRet () >= max) {
	        System.out.printf ("-1\n");
	    } else {
                System.out.printf ("%d\n", fib (n.getRet (), 0, 1));
	    }
	}
    }
    private int fib (int n, int a, int b)
    {
        switch (n) {
	case 0: return (a);
	case 1: return (b);
	default: return (fib (n - 1, b, a + b));
	}
    }
    private Input read (String prompt)
    {
        Input i = new Input ();
	Scanner s = i.getScan ();
	int c;
	for (;;) {
            System.out.printf ("(%s) ", prompt);
	    if (s.hasNext ())
	        try {
	            c = Integer.parseInt (s.next ());
	        } catch (Exception e) {
	            continue;
	        }
	    else {
	        i.togFlag ();
		return (i);
	    }
	    break;
	}
	i.setRet (c);
	return (i);
    }
}
