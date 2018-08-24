import java.util.*;
import java.io.*;
import java.util.regex.*;

class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int p,q=0;
		Set l=new HashSet();
		int flag=1;
		for(int i=0;i<n-1;i++)
		{
			p=in.nextInt();q=in.nextInt();
			if(l.contains(p)&&l.contains(q)) flag=0;
			l.add(p);l.add(q);
		}
		if(flag==1) System.out.println("YES");
		else System.out.println("NO");
	}
};