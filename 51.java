import java.util.*;
import java.io.*;
import java.util.regex.*;
import java.text.SimpleDateFormat;
import java.util.Date;

class Main {
	
	public static void main(String[] args) {
		Thread thread=new MyThread();
		thread.start();
	}
};

class MyThread extends Thread
{
	public MyThread(){}
	public void run()
	{
		SimpleDateFormat sdf=new SimpleDateFormat("[yyyy/MM/dd][HH:mm:ss]");
		while(true)
		{
			System.out.println(sdf.format(Calendar.getInstance().getTime()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}