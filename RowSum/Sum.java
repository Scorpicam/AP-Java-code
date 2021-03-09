public class Sum
{
    int[][] arr;
    public Sum (int[][] a) {arr=a;}
    public int[] sum ()
    {
        int i,j,t;
	int[][] a;
	int[] r=new int[0];
	a=arr;
	for (i=0;i<a.length;++i) {
	    for (t=j=0;j<a[i].length;++j)
	        t+=a[i][j];
	    r=append (r,t);
	} return (r);
    }
    private int[] append (int[] a,int b)
    {
        int[] r=new int[a.length+1];
	int i;
	for (i=0;i<a.length;++i) r[i]=a[i];
	r[i]=b;
	return (r);
    }
}
