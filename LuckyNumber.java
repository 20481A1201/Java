import java.util.*;
class LuckyNumber
{
  static public void main(String...args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter size of an array:");
    int n=s.nextInt();
    if(n>=1&&n<=100)
      {
        int a[]=new int[n]; //allocate dynamic mem. for array 
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++)
          {
            a[i]=s.nextInt(); 
            if(a[i]<1 ||a[i]>1000000)
              {
                System.out.println("Array values out of range:");
                break;
              }
          }
        int v=0,z=0,c=0;
        for(int i=0;i<n;i++)
          {
            z=0;
            for(int j=1;j<10;j++)
              {
                v=(int)Math.pow(7,j);
                z=z+v;
                if(v==a[i]||z==a[i])
                  {
                    c++;
                    break;
                  }
              }
            }
        System.out.println("Lucky numbers count is:"+c);
      }
      else
      System.out.println("n value is out of range:");
    }
}
