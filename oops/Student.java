package oops;
public class Student {
String name;
int rollno ;
 static String collagename;
 static int counter = 0;
 public Student(String name)
 {
	 this.name = name;
	 this.rollno = setrollno();
 }
 static int setrollno()
 {
	 counter++;
	 return counter;
 }
 static void setcollage(String name) {
	 collagename = name ;}
 void getStudentinfo()
 {
	 System.out.println("name : " + this.name);
	 System.out.println("rollno  : " + this.rollno);
	 System.out.println("collagename : " + collagename);
 }
 }