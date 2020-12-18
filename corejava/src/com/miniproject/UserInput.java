package com.miniproject;
//<dependency> <groupId>com.opencsv</groupId> <artifactId>opencsv</artifactId> <version>4.1</version> </dependency>

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) throws ParseException {
		FileReaderDemo f=new FileReaderDemo(); 
		List<Complaint> c =f.readBooksFromCSV("C:/Users/K. Kiruba/Desktop/LTI_COREJAVA_FULLSTACK/complaints.csv"); 
		/*for (Complaint b : c) {
			//System.out.println(b);
		}*/
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("1.Display all the complaints based on the year provided by the user");
		System.out.println("2.Display all the complaints based on the name of the bank provided by the user");
		System.out.println("3.Display complaints based on the complaint id provided by the user");
		System.out.println("4.Display number of days took by the Bank to close the complaint");
		System.out.println("5.Display all the complaints closed/closed with explanation");
		System.out.println("6.Display all the complaints which received a timely response");
		System.out.println("7.Take input from user for storing new complaints");
		
		System.out.println("Enter the number against the action that needs to be performed");
		n=sc.nextInt();
		 
		 switch (n) {
		 case 1:
			 System.out.println("Enter the year");
			 int y=sc.nextInt();
			 String s=String.valueOf(y);
			 OperationsDone o1=new OperationsDone();
			 o1.disp_complaints(s,c);
			 break;
		 case 2:
			 System.out.println("Enter the name of the bank");
			 String str=sc.next();
			 OperationsDone o2=new OperationsDone();
			 o2.display_complaints(str, c);
			 break;
		 case 3:
			 System.out.println("Enter the complaint id");
			 int id=sc.nextInt();
			 String st=String.valueOf(id);
			 OperationsDone o3=new OperationsDone();
			 o3.displayer_complaints(st,c);
			 break;
		 case 4:
			 System.out.println("Enter complaint id");
	
			 OperationsDone o4=new OperationsDone();
			 o4.complaintDaysBetween(c);
			 break;
			 
		 case 5:
			 OperationsDone o5=new OperationsDone();
			 o5.displaying_complaints(c);
			 break;
		 case 6:
			 OperationsDone o6=new OperationsDone();
			 o6.displayee_complaints(c);
			 break;
		 case 7:
			 System.out.println("Enter the value to be stored");
			 
			 File file = new File("C:/Users/K. Kiruba/Desktop/LTI_COREJAVA_FULLSTACK/complaints.csv");
			 FileWriter fileWriter=null;
			 String COMMA_DELIMITER=",";
			 String NEW_LINE_SEPARATOR="\n";
			 try {

			        fileWriter = new FileWriter(file); 
			        System.out.println("enter values");
			        fileWriter.append(NEW_LINE_SEPARATOR);
			        fileWriter.append(sc.next());
			        fileWriter.append(COMMA_DELIMITER);
			        fileWriter.append(sc.next());
			        fileWriter.append(COMMA_DELIMITER);
			        fileWriter.append(sc.next());
			        fileWriter.append(COMMA_DELIMITER);
			        fileWriter.append(sc.next());
			        fileWriter.append(COMMA_DELIMITER);
			        fileWriter.append(sc.next());
			        fileWriter.append(COMMA_DELIMITER);
			        fileWriter.append(sc.next());
			        fileWriter.append(COMMA_DELIMITER);
			        fileWriter.append(sc.next());
			        fileWriter.append(COMMA_DELIMITER);
			        fileWriter.append(sc.next());
			        fileWriter.append(COMMA_DELIMITER);
			        fileWriter.append(sc.next());
			        fileWriter.append(COMMA_DELIMITER);
			        fileWriter.append(sc.next());
			        fileWriter.append(COMMA_DELIMITER);
			        fileWriter.append(sc.next());
			        fileWriter.append(COMMA_DELIMITER);
			        fileWriter.append(sc.next());
			        fileWriter.append(COMMA_DELIMITER);
			        fileWriter.append(sc.next());
			        fileWriter.append(COMMA_DELIMITER);
			        fileWriter.append(sc.next());
			        fileWriter.append(NEW_LINE_SEPARATOR);
                  
                }
			 catch(IOException e) {
				 e.printStackTrace();
			 }
			 catch (Exception e) {
				 System.out.println("problem");
			 }
			 break;
	}
}
	
}
	
