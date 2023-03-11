package strings;

public class TestStrings {

	public static void main(String[] args) {
		byte bytes[] = {65,66,67,68,69};
		String str = new String(bytes);
		System.out.println(str.length());
		System.out.println(str);
		str = "Welcome to UST Global";
		bytes = str.getBytes();
		for(byte b: bytes) {
			System.out.println(b);
		}
         char chars[]= {'U','S','T',' ','G'};
         str = new String(chars);
         System.out.println(str);
         
         str.getChars(0,chars.length-1,chars,0);
         for(char c:chars) {
        	 System.out.println(c);
         }
         String string = new String("She sells sea shells on the sea shore");
         int count=0;
         for(int i=0;i<string.length();i++)
         {
        	 char c = string.charAt(i);
        	 if(c=='s'||c=='S')
             count ++;
	     }
         System.out.println(count);
         String words[]=string.split(" ");
         System.out.println(words.length);
         for(String word:words) {
        	 System.out.println(word);
         }
	}
	 String string = new String("She sells sea shells on the sea shore");
	 String words[]= string.split("[.]");
	 System.out.println(words.length);
	 for(String word : words)
	 {
		 System.out.println(word);
	 }
	 string =new String("Cartoon");
	 System.out.println(string.startWith("Car"));
	 System.out.println(string.endsWith("toon"));
	 
	 int apos = string.indexOf('a');
	 int tpos = string.indexOf('t');
	 
String string2 = string.substring(apos,tpos);
String2 = string.substring(tpos);
System.out.println(string2);

string = new String("madam");
int mpos = -1;
int dpos = string.indexOf('d',-1);
string2 = string.substring(dpos,string.length());
System.out.println(string2);

String str1 = new String("welcome");
String str2 = new String("WELCOME");

boolean result = str1.equalsIgnoreCase(str2);
System.out.println(result);
int val = str2.compareTo(str1);
System.out.println(val);
string= "Diehard";
System.out.println(string.toLowercase());
System.out.println(string);              // Strings are immutable;
}
}

