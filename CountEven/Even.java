public class Even
{
    public Even (int n)
    {
        System.out.printf ("%d\n",count (n,0));
    }
    private int count (int n,int t)
    {
	if (n==0) return (t);
	else if ((n%10)%2==0) return (count (n/10,t+1));
	else return (count (n/10,t));
    }
}
