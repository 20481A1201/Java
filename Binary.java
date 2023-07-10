class Binary 
{
  static public void main(String[] args)
  {
    java.util.Scanner s=new java.util.Scanner(System.in);
    System.out.println("Enter n value between 1 to 255");
    int n=s.nextInt();
    if(n>=1 && n<=255)
      {
        int p=Integer.parseInt(Integer.toBinaryString(n));
        String v=String.format("%08d",p);
        System.out.println("The binary value is:"+v);
      }
      else
      System.out.println("Out of range:");
  }
}
