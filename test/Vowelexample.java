package test;

public class Vowelexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//number of vowels
		String line = "this website is awesome";
int vowels=0;
String Line = line.toLowerCase();
for(int i=0;i<line.length();i++) {
	char ch = line.charAt(i);
if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'  || ch  == 'u'  ) {
				++vowels;
System.out.println("number of vowels:" +vowels);
}
}
//reversal of array
int[] array1 = {20,30,40,50,60};
for(int index=array1.length-1;index>=0;index--)
{
	System.out.println(array1[index]);
}
}
}