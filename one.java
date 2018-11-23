import java.lang.*;
import java.util.*;
class one
{
 public static void main(String args[])
 {
  String s1="cse-it";
  String s2="cse-it";
  System.out.println((s1==s2));
  String s3=new String("cse-it");
  System.out.println((s1==s3));
  String s4="CSE-IT";
  System.out.println((s1==s4));
  System.out.println((s1.equals(s3)));
    
  
}
}
