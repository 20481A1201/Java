import java.awt.event.*;
import java.applet.*;
import java.awt.*;
public class Calc extends Applet implements ActionListener
  {
    TextField t1;
    Button b[]=new Button[10];
    Button b1,b2,b3,b4,b5,b6;
    int a=0,v=1,flag=0,d,r;
    char p;
    public void init()
    {
      setLayout(new GridLayout(4,5));
      t1=new TextField(15);
      for(int i=0;i<10;i++)
        {
          b[i]=new Button(""+i);
          b[i].addActionListener(this);
        }
      b1=new Button("+");
      b2=new Button("-");
      b3=new Button("x");
      b4=new Button("/");
      b5=new Button("=");
      b6=new Button("CE");
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      b6.addActionListener(this);
      t1.addActionListener(this);
      add(t1);
      for(int i=0;i<10;i++)
        add(b[i]);
      add(b1);
      add(b2);
      add(b3);
      add(b4);
      add(b5);
      add(b6);
    }
    public void actionPerformed(ActionEvent e)
    {
      String z=e.getActionCommand(); //to get button label in string format
      char c=z.charAt(0);
      if((flag==1)&&(Character.isDigit(c)))
        t1.setText("");
      if(Character.isDigit(c))
        t1.setText(t1.getText()+z); //to concatenate text field values
      if(z.equals("+"))
        {
          a=a+Integer.parseInt(t1.getText());
          t1.setText("");
          p='+';
          flag=0;
        }
        else if(z.equals("-"))
          {
            a=Integer.parseInt(t1.getText())-a;
            t1.setText("");
            p='-';
            flag=0;
          }
          else if(z.equals("x"))
            {
              v=v*Integer.parseInt(t1.getText());
              t1.setText("");
              p='x';
              flag=0;
            }
            else if(z.equals("/"))
              {
                v=Integer.parseInt(t1.getText())/v;
                t1.setText("");
                p='/';
                flag=0;
              }
      if(z.equals("="))
        {
          d=Integer.parseInt(t1.getText());
          switch(p)
            {
                case '+': r=a+d;
                t1.setText(""+r);
                break;
                case '-': r=a-d;
                t1.setText(""+r);
                break;
                case 'x': r=v*d;
                t1.setText(""+r);
                break;
                case '/': r=v/d;
                t1.setText(""+r);
                break;
            }
                    a=0;
                    v=1;
                    flag=1;
        }
            if(z.equals("CE"))
                      {
                                  t1.setText("");
                                  flag=0;
                      }
    }
}
/*
<applet code=Calc width=150 height=150>
</applet>
*/
