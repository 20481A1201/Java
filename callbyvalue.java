importjava.util.*;
class Cbv
  {
    void swap(int a,int b)
    {
      int t=a;
      a=b;
      b=t;
      System.out.println("In the function definition "+a+","+b);
    }
    static public void main(String...args)
    {
      Scanner s=new Scanner(System.in);
      Cbv c=new Cbv();
      System.out.println("Enter Item counts in 2 bags :");
      int x=s.nextInt();
      int y=s.nextInt();
      System.out.println("Before calling:"+x+","+y);
      c.swap(x,y);
      System.out.println("After calling:"+x+","+y);

    }
}
