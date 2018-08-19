import java.util.*;
import java.io.*;

class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String numa=in.nextLine();
		String numb=in.nextLine();
		String[] spliteda = numa.split(" ");
		String[] splitedb= numb.split(" ");
		int lena=spliteda.length;
		int lenb=splitedb.length;
		LinkedList alist=new LinkedList();
		LinkedList blist=new LinkedList();
		LinkedList clist=new LinkedList();
		for(int i=0;i<lena;i++)
		{
			alist.addFirst(Integer.parseInt(spliteda[i]));
		}
		for(int i=0;i<lenb;i++)
		{
			blist.addFirst(Integer.parseInt(splitedb[i]));
		}
		int tem=0;
		if(lena>=lenb)
		{
			for(int i=0;i<lenb;i++)
			{
				tem+=(int) alist.removeFirst()+(int) blist.removeFirst();
				clist.addFirst(tem%10);
				if(tem>=10) tem=1;
				else tem=0;
			}
			for(int i=lenb;i<lena;i++)
			{
				tem+=(int) alist.removeFirst();
				clist.addFirst(tem%10);
				if(tem>=10) tem=1;
				else tem=0;
			}
			
		}
		else
		{
			for(int i=0;i<lena;i++)
			{
				tem+=(int) alist.removeFirst()+(int) blist.removeFirst();
				clist.addFirst(tem%10);
				if(tem>=10) tem=1;
				else tem=0;
			}
			for(int i=lena;i<lenb;i++)
			{
				tem+=(int) blist.removeFirst();
				clist.addFirst(tem%10);
				if(tem>=10) tem=1;
				else tem=0;
			}
		}
		if(tem==1) clist.addFirst(1);
		System.out.print(clist.removeFirst());
		try{
		while(clist!=null) System.out.print(" "+clist.removeFirst());
		}
		catch (NoSuchElementException e) {}	
	}
};