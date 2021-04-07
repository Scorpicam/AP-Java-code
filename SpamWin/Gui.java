import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
public class Gui extends JFrame
{
    private class Panel extends JPanel
    {
        int w,h;
        public Panel (int a,int b)
	{
            super ();
	    super.setSize (a,b);
	    w=a;
	    h=b;
	}
	@Override
	protected void paintComponent (Graphics g)
	{
            super.paintComponent (g);
	    g.drawString ("BOX",w/2,h/2);
	    g.drawRect (w/4,h/4,w/2,h/2);
	}
    }
    public Gui (int w,int h)
    {
        super ("SpamWin");
	super.setSize (w,h);
	super.add (new Panel (w,h));
	super.setVisible (true);
    }
}
