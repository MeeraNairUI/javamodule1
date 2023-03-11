package listdemo;
public class demo {
	public static void main(String[] args)
	{
	int i= 12321;
	String str = i+ " ";
	StringBuilder sb = new StringBuilder(str);
	sb.reverse();
	System.out.println(sb);
	Boolean result = str.equals(sb.toString());
	System.out.println(result);
}
	//Integer integer = new Integer("10");
	//String sint = str.valueOf(i);
	//int m = Integer.parseInt();
	// from Integer to String
	//String s2 = integer.toString();
	//integer = s2.parseInt();
}
