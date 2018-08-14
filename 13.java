import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		int[][] array1=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				array1[i][j]=in.nextInt();
			}
		}
		int a=in.nextInt();
		int b=in.nextInt();
		int[][] array2=new int[a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				array2[i][j]=in.nextInt();
			}
		}
		int[][] ans=new int[m][b];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<b;j++)
			{
				for(int k=0;k<n;k++)
					ans[i][j]+=array1[i][k]*array2[k][j];
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
		//System.out.println(-1);
	}
};