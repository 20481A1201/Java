import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Mouse1 extends Applet implements MouseListener,MouseMotionListener
  {
    int p=0,q=0;
    public void init()
  {
    setBackground(Color.magenta);
    setForeground(Color.blue);
    addMouseMotionListener(this);
    addMouseListener(this);
  }
    public void mouseMoved(MouseEvent e)
    {
      p=e.getX();
      q=e.getY();
      repaint(); //invoke paint method
    }
    public void mousePressed(MouseEvent e)
    {
      showStatus("Mouse pressed");
    }
    public void mouseReleased(MouseEvent e)
    {
      showStatus("Mouse released");
    }
    public void mouseClicked(MouseEvent e)
    {
      showStatus("Mouse clicked");
    }
    public void mouseEntered(MouseEvent e)
    {
      showStatus("mouse entered");
    }
    public void mouseExited(MouseEvent e)
    {
      showStatus("Mouse exited");
    }
    public void mouseDragged(MouseEvent e)
    {
      showStatus("mouse dragged");
    }
    public void paint(Graphics g)
    {
      g.setFont(new Font("Bookman Old Style",Font.BOLD,40));
      g.drawString(" X-coordinate is:"+p,40,200);
      g.drawString(" Y-cooordinate is:"+q,40,400);
    }
  }
/*
<applet code=Mouse1 width=400 height=600>
</applet>
*/
