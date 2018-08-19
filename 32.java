import java.util.*;
import java.io.*;

class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String filter=in.next();
		
		File file = new File("/usr/bin");
		
		List<File> ansList = new ArrayList<File>();
		if (file != null) 
		{
			File[] fileArray = file.listFiles();
			if (fileArray != null )
			{
				for (File f : fileArray) 
				{
					String fileName = f.getName();
					if (fileName.toLowerCase().indexOf(filter) != -1||fileName.toUpperCase().indexOf(filter) != -1)
					{
						ansList.add(f);
					}
				}
			}
		}
		if (ansList != null ) 
		{
			Collections.sort(ansList);
			for (File f : ansList) 
			{
				System.out.println(f.getName());
			}
		}
	}
};