package test;

public class Loopexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while loop to print 1 to 10
int num1= 1;
while(num1<=10)
{
	if(num1==5) {
		num1 = num1+1;
		continue; 
	}
	System.out.println(num1);
num1 = num1+1;
		}

//for loop to print 1 to 10
for(int count1=1;count1<=10;count1++)
{
if(count1==5) {
	break;
	}
	System.out.println("inside for loop " + count1);
}
//for loop to print 10 to 1
for(int count1=10;count1>=1;count1--)
{
	System.out.println("the count value="+count1);
}

//for loop for array
	int[] array1 = {20,30,40,50,60};
	for(int index=0;index<array1.length;index++)
	{
		System.out.println("value inside array " + array1[index]);
	}
	for(int var1:array1) {
		System.out.println(var1);
	}
	}
}