import java.util.*;
class GradeCal
{
  public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     int s1,s2,s3,s4,s5;
     s1 = sc.nextInt();
     s2 = sc.nextInt();
     s3 = sc.nextInt();
     s4 = sc.nextInt();
     s5 = sc.nextInt();
     float avg;
     avg = (s1+s2+s3+s4+s5)/5;
     if (avg>90)
        System.out.println("A grade");
     else if(avg<90 && avg > 80)
        System.out.println("B grade");
     else if(avg <80 && avg > 70)
        System.out.println("C grade");
     else if(avg<70 && avg > 60)
        System.out.println("D grade");
     else if(avg<60 && avg > 50)
        System.out.println("E grade");
     else 
        System.out.println("fail");
   }
}
   
   
   
   
   
      