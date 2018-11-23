import java.util.*;
class Word
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ur input");
        String str1=s.toString();
        String str="talk,stalk,take,stamp,walk,fork";
        String stringArr[] = str.split("");
        for (int i = 0; i < stringArr.length; i++) {
            System.out.println(str);
            if(stringArr[1]==str)
            
                System.out.print(str);
            else
                System.out.println(stringArr[i]);
		}
	}
}
		
		
