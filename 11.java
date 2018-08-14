import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			String a=in.next();
			String b=in.next();
			int alen=a.length();
			int blen=b.length();
			int clen=alen>blen?alen+1:blen+1;
			int[] ans=new int[clen];
			char[] chara = new StringBuffer(a).reverse().toString().toCharArray();
			char[] charb = new StringBuffer(b).reverse().toString().toCharArray();
			int longlen=alen>blen?alen:blen;
			int shortlen=alen+blen-longlen;
			for(int i=0;i<shortlen;i++)
			{
				ans[i]=chara[i]-'0'+charb[i]-'0';
			}
			for(int j=shortlen;j<longlen;j++)
				ans[j]=alen>blen?chara[j]-'0':charb[j]-'0';
			for(int k=0;k<longlen;k++)
			{
				if(ans[k]>=10)
				{
					ans[k]=ans[k]%10;
					ans[k+1]+=1;
				}
			}
			if(ans[longlen]!=0) System.out.print(ans[longlen]);
			for(int i=longlen-1;i>=0;i--)
				System.out.print(ans[i]);
			System.out.println();
		}
	}
};