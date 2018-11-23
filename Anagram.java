import java.util.*;
import java.lang.*;
public class Anagram
{
	static void anagram(String s1,String s2)
	{
		String a,b;
		a=s1.replace(" ","");
		b=s2.replace(" ","");
		//a=s1.trim();
		//b=s2.trim();
		char[] a1=a.toLowerCase().toCharArray();
		char[] b1=b.toLowerCase().toCharArray();
		//a1=a.toLowerCase().toCharArray();
		//b1=b.toLowerCase().toCharArray();
		boolean count=true;
		if(a.length()==b.length())
		{
			Arrays.sort(a1);
			Arrays.sort(b1);
			
			count=Arrays.equals(a1,b1);
		}
		else
		{
			count=false;
		}
		if(count==true)
		{
			System.out.println(s1 + " and " + s2 + " are " + "anagrams");
		}
		else
		{
			System.out.println(s1+ " and " +s2+ " are " +" Not anagrams");
		}
			



}

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	anagram(s1,s2);
}
}
