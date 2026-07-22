import java.util.*;
class MulTable
{
  public static void main(String args[])
   {
    int i;
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    for(i=1;i<=10;i++)
       System.out.println(num+"x" +i+"="+num*i);
   }
}