import java.util.*;
class Prime
{
 public static void main(String args[])
 {
   int i;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number");
   int n = sc.nextInt();
   for(i=2;i<=n;i++)
   {
     int j;
     int count=0;
     for(j=1;j<=i;j++)
     {
       if(i%j==0)
       {
         count++;
       }
      }
   if(count==2)
   {
     System.out.println(i+" ");
   }
 }
}
}