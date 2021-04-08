public class At
{
    public At () {}
    public int follow (Matrix m,int i,int j) { return (r (m,i,j,0)); }
    public int follow (Matrix m) { return (follow (m,0,0)); }
    private int r (Matrix m,int i,int j,int n)
    {
        char[][] a=m.getSym ();
	boolean[][] b=m.getCheck ();
	if (b[i][j]||a[i][j]=='-') return (n);
	b[i][j]=true;
	m.setCheck (b);
	++n;
	n=i!=0?r (m,i-1,j,n):n;
	n=i!=b.length-1?r (m,i+1,j,n):n;
	n=j!=0?r (m,i,j-1,n):n;
	n=j!=b[i].length-1?r (m,i,j+1,n):n;
	return (n);
    }
}
