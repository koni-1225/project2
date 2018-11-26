import java.util.*;
public class anagram
{
	public boolean  anag(String a,String b)
	{
			a  = a.replaceAll("\\s", "").toLowerCase();
			b = b.replaceAll( "\\s","").toLowerCase();

		if(a.length()==b.length())
		{
			char ar1[]=a.toCharArray();
			char ar2[]=b.toCharArray();
			Arrays.sort(ar1);
			Arrays.sort(ar2);
			if(Arrays.equals(ar1,ar2))
			{
				return Arrays.equals(ar1,ar2);
			}
			else
				return false;
		
		}
		else
			return false;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
        System.out.println("Enter Firt Word:");
		String a=s.nextLine();
        System.out.println("Enter Second Word:");
		String b=s.nextLine();
		anagram obj = new anagram();
 
obj.anag(a,b);
		boolean i;
		i=obj.anag(a,b);
		if(i==true)
			System.out.println(a+ " is an anagram of "+b);
		else
			System.out.println(a+" is not an anagram of "+b);
	}
}
		
