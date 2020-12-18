package com.Collec;

import java.util.Scanner;

public class Course{
	
		int courseid;
		String coursename;
		int duration;
		int fee;
	
		public Course(int x,String y,int z,int w){
			courseid=x;
			coursename=y;
			duration=z;
			fee=w;
			}
		
		public void showdetails() {
			// TODO Auto-generated method stub
			System.out.println(this.courseid);
			System.out.println(this.coursename);
			System.out.println(this.duration);
			System.out.println(this.fee);
			
		}
	}