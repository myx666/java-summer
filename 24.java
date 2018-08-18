import java.util.*;

class People
{
	String type,id,sex,name,age,year,major;
	People(String _type,String _teacherid,String _sex,String _age,String _major)
	{	
		type=_type;id=_teacherid;sex=_sex;age=_age;major=_major;
	}
	People(String _type,String _studentid,String _name,String _sex,String _age,String _year)
	{
		type=_type;id=_studentid;name=_name;sex=_sex;age=_age;year=_year;
	}
	static void initial(String _str,People[] _school,int i)
	{
		String[] splited = _str.split(" ");
		if(splited[0].equals("Teacher")) 
		{
			_school[i]=new People(splited[0],splited[1],splited[2],splited[3],splited[4]);
		}
		else if(splited[0].equals("Student")) 
		{
			_school[i]=new People(splited[0],splited[1],splited[2],splited[3],splited[4],splited[5]);
		}
	}

	static void addinfo(String _str,People[] _school,int[] _count)
	{
		String[] splited = _str.split(" ");
		String findtype= _str.split(" ")[0];
		String findid= _str.split(" ")[1];
		for(int j=0;j<_school.length;j++)
		{
			if(((_school[j].type.equals("Teacher")&&findtype.equals("T"))||
				(_school[j].type.equals("Student")&&findtype.equals("S")))&&_school[j].id.equals(findid))
			{
				_count[j]++;
			}
		}
	}
	static void findans(People[] _school,int[] _count)
	{
		int n=_school.length;
		int max=0;
		for(int i=0;i<n;i++)
		{
			if(_count[i]>max) max=_count[i];
		}
		for(int i=0;i<_count.length;i++)
		{
			if(_count[i]==max)
			{
				if(_school[i].type.equals("Teacher"))
				{
					System.out.println(_school[i].type+" "+_school[i].id+" "+_school[i].sex+" "+
							_school[i].age+" "+_school[i].major);
				}
				else if(_school[i].type.equals("Student"))
				{
					System.out.println(_school[i].type+" "+_school[i].id+" "+_school[i].name+" "+_school[i].sex
							+" "+_school[i].age+" "+_school[i].year);
				}
			}
		}
	}
};

class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		String strtem=in.nextLine();
		People[] school=new People[n];
		int[] count=new int[n];
		for(int i=0;i<n;i++)
		{
			String str=in.nextLine();
			People.initial(str, school, i);
		}
		for(int i=0;i<m;i++)
		{
			String str=in.nextLine();
			People.addinfo(str,school,count);
		}
		People.findans(school,count);
	}
};