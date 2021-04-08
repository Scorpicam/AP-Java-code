public class Matrix
{
    private char[][] sym;
    private boolean[][] check;
    public Matrix (int a,int b) { init (a,b,'@','-'); }
    public Matrix () { this (10,10); }
    public char[][] getSym () { return (sym); }
    public boolean[][] getCheck () { return (check); }
    public void setSym (char[][] a) { sym=a; }
    public void setCheck (boolean[][] a) { check=a; }
    public void init (int a,int b,char c,char d)
    {
        char[][] e=new char[a][b];
	boolean[][] f=new boolean[a][b];
	int i,j;
	for (i=0;i<a;++i)
	    for (j=0;j<b;++j) {
	        e[i][j]=(int)(Math.random ()*2)==1?c:d;
		f[i][j]=false;
	    }
	setSym (e);
	setCheck (f);
    }
    public void print ()
    {
        char[][] a=getSym ();
	int i,j;
	for (i=0;i<a.length;++i)
	    for (j=0;j<a[i].length;++j) {
	        System.out.printf ("%c ",a[i][j]);
		if (j==a[i].length-1) System.out.printf ("\n");
	    }
    }
}
