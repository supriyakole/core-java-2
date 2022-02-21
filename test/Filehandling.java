package test;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Filehandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1 = "order confirmation 1233434";
	FileOutputStream file ;
	try {
	    file = new FileOutputStream("results.txt");
		file.write(str1.getBytes());
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
