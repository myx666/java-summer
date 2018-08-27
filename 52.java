import java.util.*;
import java.io.*;
import java.net.*;
import java.util.regex.*;
import java.text.SimpleDateFormat;
import java.util.Date;

class Main {
	
	public static void main(String[] args) throws IOException {
		
		Scanner in=new Scanner(System.in);
		String filter=in.next();
		URL cs=new URL("http://www.114la.com/");
		URLConnection tc=cs.openConnection();
		Pattern p=Pattern.compile("[\\w\\.]+\\.com");
		BufferedReader input=new BufferedReader(new InputStreamReader(tc.getInputStream(),"utf-8"));
		String inputLine;
		Set<String> mySet=new HashSet<String>();
		while((inputLine=input.readLine())!=null)
		{
			Matcher m=p.matcher(inputLine);
			while(m.find())
			{
				mySet.add(inputLine.substring(m.start(),m.end()).toLowerCase());
			}
		}
		input.close();
		/*BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("info.txt")));
		Iterator i=mySet.iterator();
		while(i.hasNext())
		{
			writer.write((String)i.next());
			writer.newLine();
		}
		writer.close();*/
		
		List<String> ansList = new ArrayList<String>();
		for ( String address : mySet) 
		{
					
			if (address.indexOf(filter) != -1)
			{
				ansList.add(address);
			}
		}
		if (ansList != null ) 
		{
			Collections.sort(ansList);
			for (String address : ansList) 
			{
				System.out.println(address);
			}
		}
	}
};

