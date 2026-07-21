import java.util.*;
class factorial
{
   double RecFact(int n)
   {
     if(n==0 || n==1)
	{
		return 1;
	}
     else
	{
		return n*RecFact(n-1);
	}
   }
   double Iterative(int m)
   {
      if(m==0 || m==1)
      {
	return 1;
      }
      else
      {
	int fact=1;
	for(int i=1;i<=m;i++)
	{
		fact=fact*i;
	}
	return fact;
      }
   }
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      int num;
      System.out.println("Enter");
      num=sc.nextInt();
      factorial obj=new factorial();
      System.out.println("Rec fact"+obj.RecFact(num));
      System.out.println("Ite fact"+obj.Iterative(num));
  }
}

