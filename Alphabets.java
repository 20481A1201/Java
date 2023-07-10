importjava.util.*;
class Alphabets
  {
    static public void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int c=0;
      System.out.println("Enter no. of characters in a String:");
      int n=s.nextInt();
      if(n>=1 && n<=100)
        {
          System.out.println("Enter the alphabets in lexicographical order of length "+n);
          String str=s.next();
          charch[]=str.toCharArray();
          for(int i=0;i<n;i++)
            {
              c=0;
              for(int j=i+1;j<n;j++)
                {
                  if(ch[i]<ch[j])
                    c++;
                }
              System.out.print(" "+c);
            }
        }
        else
        System.out.println(“Out of Range:”);
    }
  }
