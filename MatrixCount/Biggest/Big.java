public class Big
{
    int[][] arr;
    public Big (int[][] a)
    {
        arr=a;
    }
    public int cmp ()
    {
        int[][] a=arr;
	int i,j,t;
	t=a[0][0];
	for (i=0;i<a.length;++i)
            for (j=0;j<a[i].length;++j)
	        if (a[i][j]>t)
		    t=a[i][j];
	return (t);
    }
}
