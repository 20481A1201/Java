import java.util.*;
class Cbr
  {
    int x,y;
    void swap(Cbr r)
    {
      int t=r.x;
      r.x=r.y;
      r.y=t;
      System.out.println("In the function definition "+r.x+","+r.y);
    }
    static public void main(String...args)
    {
      Scanner s=new Scanner(System.in);
      Cbr c=new Cbr();
      System.out.println("Enter Item counts in 2 bags :");
      c.x=s.nextInt();
      c.y=s.nextInt();
      System.out.println("Before calling:"+c.x+","+c.y);
      c.swap(c);
      System.out.println("After calling:"+c.x+","+c.y);
    }
}
