import java.util.Scanner;
public class Main
{
    public static void main (String[] args)
    {
        char c;
	Scanner s=new Scanner (System.in);
	System.out.printf ("`h' for hit, `p' for pass\n");
	BlackJack b=new BlackJack ();
	for (;;) {
	    System.out.printf ("* ");
	    c=s.nextLine ().charAt (0);
	    if (c=='h') b.hit ();
	    else if (c=='p') break;
	    else System.err.printf ("[ERROR] invalid input\n");
	    b.display ();
	} b.show ();
	System.out.printf ("%s",b.winner ()?"You Win!\n":"You Lose :(\n");
    }
}
