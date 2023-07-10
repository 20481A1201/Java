import java.util.*;
class Sgpa
{
  static public void main(String...args)
  {
    double sum=0,SGPA=0,p=0;
    int points=-1;
    Scanner s=new Scanner(System.in);
    String sub[]={"Graphics","PPS"," JAVA","Chemistry","English","TechnicalSkills","DataStructures"};
    double credits[]={2,4,3,3,2,1.5,4};
    for(int i=0;i<7;i++)
      {
        System.out.println("Enter "+sub[i]+" Subject Grade");
        String Grade=s.next();
        switch(Grade)
          {
              case "A+":points=10;break;
              case "A":points=9;break;
              case "B":points=8;break;
              case "C":points=7;break;
              case "D":points=6;break;
              case "E":points=5;break;
              case "F":points=0;break;
              default:System.out.println("Wrong Grade, Please Renter the Grade");
                i=i-1;
               break;
            }
        if(points==-1)
          continue;
        if(points==0)
          break;
        sum=sum+points*credits[i];
        p+credits[i];
      }
    if(points==0)
      System.out.println("Student Failed in the exam, NO SGPA");
      else
      {
        SGPA=sum/p;
        System.out.format("SGPA is:%.2f",SGPA);
      }
  }
}
