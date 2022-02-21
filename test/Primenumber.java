package test;

public class Primenumber {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
int num =13;
boolean flag = true;
for(int index=2;index<num/2;index++)
{
	int remainder=num%index;
	if (remainder == 0)
			{
		flag = false;
break ;
			}
}
if(flag==true)
{
	System.out.println("the num is prime");
}else {
	System.out.println("the number is not prime");
}
	}
}

	

