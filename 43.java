import java.util.*;
import java.io.*;
import java.util.regex.*;

class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		Pattern p=Pattern.compile("(199\\d|200\\d|201[0-7])-((0[^02]|1[0-2])-(0[^0]|[1-2][0-9]|30)|(0[1|3|5|7|8]|10|12)-31|02-(0[^0]|1[0-9]|2[0-8]))");
		Matcher m=p.matcher(str);
		int flag=0;
		int pos=0;
		while(m.find(pos))
		{
			flag=1;
			System.out.println(str.substring(m.start(),m.end()));
			pos=m.end()-2;
		}
		if(flag==0) System.out.println("NotMatch");
	}
};