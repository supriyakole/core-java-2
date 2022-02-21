package oops;

public class Methodoverloadingexmaple {
public void sum(int a,int b) {
	int result = a+b;
	System.out.println("sum is " + result);
}
public void sum (int a,int b,int c ) {
	int result = a+b+c;
	System.out.println("sum is " + result);
}
}