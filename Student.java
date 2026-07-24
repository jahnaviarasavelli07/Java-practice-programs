import java.util.*;
class Student
{
   String name;
   int age;
   void read()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Student's Name:");
       name=sc.nextLine();
       System.out.println("Enter Student's Age:");
       age=sc.nextInt();
   }
   void display()
   {
       System.out.println(name);
       System.out.println(age);
   }
   public static void main(String args[])
   {
       Student s = new Student();
       s.read();
       s.display();
   }
}