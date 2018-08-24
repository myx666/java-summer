import java.util.*;
import java.io.*;
import java.util.regex.*;

class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		Pattern p=Pattern.compile("<[^>]*>");
		Matcher m=p.matcher(str);
		StringBuffer sb=new StringBuffer();
		while(m.find())
		{
			m.appendReplacement(sb,"");
		}
		m.appendTail(sb);
		System.out.println(sb);
	}
};