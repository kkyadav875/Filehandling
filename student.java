import java.util.Scanner;
import java.io.FileOutputStream;

class Student {
	
	public  static void main (String [] args){
	
	try{
		FileOutputStream f = new FileOutputStream("student.txt");
		String name = "Krishan Yadav";
		byte[] a = name.getBytes();
		f.write(56);
		f.close();
	}
	
	catch( Exception e) {
		System.out.print("File not found !!!");
	}
	}
}