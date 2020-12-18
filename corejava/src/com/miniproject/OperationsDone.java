package com.miniproject;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class OperationsDone {
	public void disp_complaints(String a, List<Complaint> b) {
		int i;
		List<Complaint> comp = new ArrayList<>(b);

		for (i = 1; i <= comp.size(); i++)
			if (comp.get(i).getDate_receive().contains(a)) {
				System.out.println(comp.get(i).getIssue());
			}

	}

	public void display_complaints(String a, List<Complaint> b) {
		int i;
		List<Complaint> comp = new ArrayList<>(b);
		for (i = 1; i <= comp.size(); i++)
			if (comp.get(i).getCompany().contains(a)) {
				System.out.println(comp.get(i).getIssue());
			}

	}

	public void displayer_complaints(String a, List<Complaint> b) {
		int i;
		List<Complaint> comp = new ArrayList<>(b);
		for (i = 1; i <= comp.size(); i++)
			if (comp.get(i).getId().contains(a)) {
				System.out.println(comp.get(i).getIssue());
			}

	}
	public void complaintDaysBetween(List<Complaint> al)
	{
		SimpleDateFormat date=new SimpleDateFormat("MM/dd/yyyy",Locale.ENGLISH);
		System.out.println("Enter a complaint id to get number of days it took to solve: ");
		Scanner sc=new Scanner(System.in);
		int id1=sc.nextInt();
		String st1=String.valueOf(id1);
		for(Complaint c:al)
		{
			if(c.getId().equals(id1))
			{
				try {
					Date d1= date.parse(c.getDate_receive());
					Date d2=date.parse(c.getDate_sent());
					long diffInMillies=Math.abs(d2.getTime()-d1.getTime());
					long diff=TimeUnit.DAYS.convert(diffInMillies,TimeUnit.MILLISECONDS);
					System.out.println(diff);
				}catch(ParseException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	public void displaying_complaints(List<Complaint> b) {
		int i;
		List<Complaint> comp = new ArrayList<>(b);
		for (i = 1; i <= comp.size(); i++)
			if ((comp.get(i).getComp_resp().contains("Closed") || (comp.get(i).getComp_resp().contains("Closed with explanation")))){
				System.out.println(comp.get(i).getIssue());
			}

	}
	public void displayee_complaints(List<Complaint> b) {
		int i;
		List<Complaint> comp = new ArrayList<>(b);
		for (i = 1; i <= comp.size(); i++)
			if ((comp.get(i).getTimely().contains("Yes"))){
				System.out.println(comp.get(i).getIssue());
			}

	}
}