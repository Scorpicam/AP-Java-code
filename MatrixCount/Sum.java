public class Sum
{
    int[][] arr;
    public Sum (int[][] a)
    {
        arr=a;
    }
    public int sum (int d)
    {
        int[][] a=arr;
	int i,j,t;
	for (i=t=0;i<a.length;++i)
            for (j=0;j<a[i].length;++j)
	        if (a[i][j]==d)
		    ++t;
	return (t);
    }
}
