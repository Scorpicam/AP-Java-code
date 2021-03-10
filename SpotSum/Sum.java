public class Sum
{
    private int[][] a;
    public Sum (int[][] n)
    {
        a=n;
    }
    public int sum (int m,int n)
    {
        int i,j,t;
	t=0;
	for (i=m-1;i<m+2;++i)
	    for (j=n-1;j<n+2;++j)
		if (i>-1&&i<a.length&&j>-1&&j<a[i].length)
		    t+=a[i][j];
	return (t);
    }
}
