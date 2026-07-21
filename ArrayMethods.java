import java.util.*;
class ArrayMethods
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,sum=0,avg,max,min,val;
		System.out.println("enter");
		val=sc.nextInt();
		int a[]=new int[val];
		System.out.println("enter elements");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/val;
		max=min=a[0];
		for(i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Sum"+sum);
		System.out.println("Avg"+avg);
		System.out.println("Max"+max);
		System.out.println("Min"+min);
	}
}