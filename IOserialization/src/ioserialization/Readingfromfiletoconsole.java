package ioserialization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Readingfromfiletoconsole {

	public static void main(String[] args) throws IOException {
           FileReader reader = new FileReader("D:\\ustcore\\IOserialization\\src\\ioserialization\\Keyboardtofile.java");
           BufferedReader buffer = new BufferedReader(reader);
           String data = buffer.readLine();
           while(data!=null) {
        	   System.out.println(data);
        	   data=buffer.readLine();
           }
           reader.close();
           buffer.close();
	}

}
