package ioserialization;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Readingfromfilewritetofile {
	public static void main(String[] args) throws IOException {
		
	
	FileReader reader = new FileReader( "D:\\\\ustcore\\\\IOserialization\\\\src\\\\ioserialization\\\\Keyboardtofile.java");
	BufferedReader buffer = new BufferedReader(reader);
	FileWriter writer = new FileWriter("Copy.txt");
	String data = null;
	while((data =buffer.readLine()) !=null){
		writer.write(data +'\n');
	}
	writer.flush();
	writer.close();
	writer.close();
	buffer.close();
	}
}
