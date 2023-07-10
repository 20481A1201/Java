import java.awt.event.*;
import java.awt.*;
import java.applet.*;
public class Key extends Applet implements KeyListener
  {
    String msg="";
    public void init()
    {
      setBackground(Color.red);
      addKeyListener(this);
    }
    public void keyPressed(KeyEvent e)
    {
      int v=e.getKeyCode();
      showStatus("Key pressed");
      switch(v)
        {
            case KeyEvent.VK_1: showStatus("Number 1 is pressed");
            break;
            case KeyEvent.VK_NUMPAD1: showStatus("Numeric key pad 1 is pressed");
            break;
            case KeyEvent.VK_F12: showStatus("F12 Functional key is pressed");
            break;
            case KeyEvent.VK_ALT: showStatus("Alt Key is pressed:");
            break;
            case KeyEvent.VK_LEFT: showStatus("Left Arrow is pressed");
            break;
          }
      repaint();
    }
    public void keyTyped(KeyEvent e)
    {
      msg=msg+e.getKeyChar();
    }
    public void keyReleased(KeyEvent e)
    {
      showStatus("Key Up");
    }
    public void paint(Graphics g)
    {
      g.drawString("Typed Characters are:"+msg,250,250);
    }
  }
/*
<applet code="Key.class" width="300" height="300">
</applet>
*/
