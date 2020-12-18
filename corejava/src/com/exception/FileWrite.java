package com.exception;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public static void main(String args[])
	{
		String data="welcome";
		FileWriter fw=null;
		try {
			fw=new FileWriter("test.txt");
			fw.write(data);
			System.out.println("written");
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally
		{
			try {
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
