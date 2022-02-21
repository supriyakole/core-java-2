package test;

public class Reversalexample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
String str1 = "clean india green india";
String revstr1 = "";
 for(int index=str1.length()-1;index>=0;index--)
 {
	 revstr1 = revstr1 + str1.charAt(index);
	 }
	 System.out.println("reversed string is " + revstr1);


//reversal of number
int num5 = 452356;
int rev=0;{

while(num5>0)
{
	int remainder = num5%10;
	rev = rev*10+remainder;
			num5=num5/10;

System.out.println("the revesed value is " +rev);
}
}
}
}