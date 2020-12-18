

package com.miniproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

public class FileReaderDemo {

	public static void main(String[] args) {
		List<Complaint> c = readBooksFromCSV("C:/Users/K. Kiruba/Desktop/LTI_COREJAVA_FULLSTACK/complaints.csv"); // let's print all the person read from CSV file
		for (Complaint b : c) {
			//System.out.println(b);
		}
		
	}

	public static  List<Complaint> readBooksFromCSV(String fileName) {
		List<Complaint> cl = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
		//System.out.println(fileName);
		//System.out.println(pathToFile);

		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.ISO_8859_1)) {

			String line = br.readLine();
			//System.out.println(line);
			
			while (line != null) {
                
				String[] attributes = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
				//System.out.println(attributes);
				Complaint attri = createComplaint(attributes);

				cl.add(attri);

				line = br.readLine();
				//System.out.println(line);
			}

		} 
		catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cl;
	}


public static Complaint createComplaint (String[] metadata) throws ParseException{
	//metadata[0]= metadata[0]/; 
	//Date date_receive=new SimpleDateFormat("MM/dd/yyyy").parse(metadata[0]);
	String date_receive=metadata[0];
	String product = metadata[1];
	String sub_pro = metadata[2]; 
	String issue = metadata[3];
	String sub_issue = metadata[4];
	String company = metadata[5];
	String state = metadata[6];
	String zip = metadata[7];
	String submit_via = metadata[8];
	//metadata[9]=metadata[9]/; 
	//Date date_sent = new SimpleDateFormat("MM/dd/yyyy").parse(metadata[9]);
	String date_sent =metadata[9];
	String comp_resp = metadata[10];
	String timely = metadata[11];
	String disp = metadata[12];
	String id = metadata[13];
	
	return new Complaint(date_receive,product,sub_pro,issue,sub_issue,company,state,zip,submit_via,date_sent,comp_resp,timely,disp,id);
	

}
}

class Complaint{
	private String date_receive;
	private String product;
	private String sub_pro;
	private String issue;
	private String sub_issue;
	private String company;
	private String state;
	private String zip;
	private String submit_via;
	private String date_sent;
	private String comp_resp;
	private String timely;
	private String disp;
	private String id;
	Complaint(){
		
	}
	public Complaint(String date_receive, String product, String sub_pro, String issue, String sub_issue,
			String company, String state, String zip, String submit_via, String date_sent, String comp_resp,
			String timely, String disp, String id) {
	
		this.date_receive = date_receive;
		this.product = product;
		this.sub_pro = sub_pro;
		this.issue = issue;
		this.sub_issue = sub_issue;
		this.company = company;
		this.state = state;
		this.zip = zip;
		this.submit_via = submit_via;
		this.date_sent = date_sent;
		this.comp_resp = comp_resp;
		this.timely = timely;
		this.disp = disp;
		this.id = id;
	}
	public String getDate_receive() {
		return date_receive;
	}
	public void setDate_receive(String date_receive) {
		this.date_receive = date_receive;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getSub_pro() {
		return sub_pro;
	}
	public void setSub_pro(String sub_pro) {
		this.sub_pro = sub_pro;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getSub_issue() {
		return sub_issue;
	}
	public void setSub_issue(String sub_issue) {
		this.sub_issue = sub_issue;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getSubmit_via() {
		return submit_via;
	}
	public void setSubmit_via(String submit_via) {
		this.submit_via = submit_via;
	}
	public String getDate_sent() {
		return date_sent;
	}
	public void setDate_sent(String date_sent) {
		this.date_sent = date_sent;
	}
	public String getComp_resp() {
		return comp_resp;
	}
	public void setComp_resp(String comp_resp) {
		this.comp_resp = comp_resp;
	}
	public String getTimely() {
		return timely;
	}
	public void setTimely(String timely) {
		this.timely = timely;
	}
	public String getDisp() {
		return disp;
	}
	public void setDisp(String disp) {
		this.disp = disp;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	//@Override
	public String toString() {
		return " [received=" + date_receive + ", Product=" + product + ", Sub-product=" + sub_pro + ", Issue=" + issue +", Sub-Issue=" + sub_issue + ", Company=" +company+ ", State="+state + ", Zip=" +zip+ ", Submit via=" +submit_via+ ", Date-sent="+date_sent + ", Response="+comp_resp + ", Timely="+timely + ", Disputed="+disp + ", ID="+id +"]";
	}
}

