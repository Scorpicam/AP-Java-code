public class Maze
{
    public Maze () {}
    public boolean prufen (boolean[][] m) { return (matze (m,0,0,false)); }
    private boolean matze (boolean[][] m,int i,int j,boolean p)
    {
        m[i][j]=false;
	if (j==m[i].length-1) return (true);
	try{if (m[i-1][j]) p|=matze (m,i-1,j,p);}catch (Exception e){}
	try{if (m[i+1][j]) p|=matze (m,i+1,j,p);}catch (Exception e){}
	try{if (m[i][j-1]) p|=matze (m,i,j-1,p);}catch (Exception e){}
	try{if (m[i][j+1]) p|=matze (m,i,j+1,p);}catch (Exception e){}
	return (p);
    }
}
