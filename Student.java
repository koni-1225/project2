import java.lang.*;
import java.util.*;
class Student
{
    void ToppersAvg(float avg)
    {
       
        System.out.println("Overall Average is:"+avg);
    }
}
   
class Dept extends Student
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      Student c=new Student();
      System.out.println("Enter no.of students:");
      int i,k=5;
      int n=sc.nextInt();
      int a[]=new int[n];
      for(i=0;i<a.length;i++)
      {
          a[i]=sc.nextInt();
      }
      System.out.println("Marks are:" );
      for(i=0;i<n;i++)
      {
          System.out.print(a[i]+" ");
      }
       float avg=0;
       for(i=0;i<n;i++)
       {
           avg+=a[i];
        }
           avg=avg/n;
           c.ToppersAvg(avg);
           int per;
           for(i=0;i<n;i++)
           {
               per=(a[i]/k)*100;
               per=per/100;
               System.out.println(" percentage of  student " + (i+1) + " is: "+ per +"%");
           }
   
 }
  
  
}




