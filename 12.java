import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
		int m=in.nextInt();
		int n=in.nextInt();
		int[] array=new int[m];
		for(int i=0;i<m;i++)
		{
			array[i]=in.nextInt();
		}
		Arrays.sort(array);
		int num=0;
		int count=0; 
		while(num<m&&count<n)
		{
			if(array[num]!=1) 
			{
				int flag=1;
				for(int i=2;i<=Math.sqrt(array[num]);i++)
				{
					if(array[num]%i==0) 
					{
						flag=0;break;
					}
				}
				if(flag==1){
					count++;
				}
			}
			num++;
		}
		if(count==n)
		{
			System.out.println(array[num-1]); 
		}
		else System.out.println(-1);
		}
	}
};