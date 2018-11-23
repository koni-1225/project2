import java.util.*;
import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;
public class Array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,s,n1,temp,j;
		System.out.println("Enter size and elements");
		s=sc.nextInt();
		int a[]=new int[s];
		for(i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<s;i++)
		{
			for(j=i+1;j<s;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		//int n=sc.nextInt();
		n1=8*s;
		int d[]=new int[n1];
		
		
		
			for(i=0;i<n1;i++)
			{
				
			  d[i]=a[i%s];
		  }
		  Arrays.sort(d);
		  for(i=0;i<n1;i++)
		  {
			  System.out.print(d[i]+" ");
			
		}
		
	}
}



