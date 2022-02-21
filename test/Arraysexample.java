package test;

public class Arraysexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num1 = {20,30,40,50};
System.out.println("total num of values are " + num1.length);
System.out.println("value at 3rd position is " + num1[2]);
System.out.println("value at last positin is " + num1[num1.length-1]);

String[] name1 = { "abc","xyz","pqr"};
System.out.println("value at 3rd position is " + name1[2]);
String name = "Clean India Green India Love India";
String[]arrwords = name.split(" ");
System.out.println("value at 3rd position is " + arrwords[2]);
System.out.println("total no of words are " +arrwords.length);
}
}