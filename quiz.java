import java.util.*;
import java.lang.*;
public class quiz
{
	public void quiz()
	{
		Scanner sc=new Scanner(System.in);
		int n,i=0,j,c=0,max;
		String b;
		System.out.println("Enter no.of participants:");
		n=sc.nextInt();
		sc.nextLine();
		int count[]=new int[100];
		String[] ans={"sun","skin","sun","nile","chettah","camel","gandhi","365","7","26"};
		String[] que={"1.Which is the nearest star to planet earth?","2.Which is the most sensitive organ in our body?","3.Which is the principal source of energy for earth?","4.Which is the longest river on the earth?","5.Which is the fastest animal on the land?","6.Which is the animal referred as the ship of the desert?","7.Who is known as the father of India?","8.How many months do you have in a year","9.How many days do we have in a week","10.How many letters we have in english"};
		while(i<n)
		{
			c=0;
			for(j=0;j<10;j++)
			{
				
				System.out.println(que[j]);
				
				b=sc.nextLine();
				if(b.equals(ans[j]))
				{
					c=c+1;
					
				}
			}
			count[i]=c;
			i++;
		}
		max=count[0];
		int k=0;
		for(i=0;i<n;i++)
		{
			
			if(max<count[i+1])
			{
				max=count[i+1];
				k=i+1;
			}
		}
		System.out.println("Winner is:"+k+ "marks are:"+max);
		
	}

public static void main(String args[])
{
	quiz m=new quiz();
	m.quiz();
}
}
		
				
		
