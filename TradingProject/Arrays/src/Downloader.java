//This class is downloading historical data for a specific stock starting at a date and finishing at specific date.
//the data is going to  be saved in a specified directory  as csv file. The name of the file will be Symbol_Daily.csv
// Downloader ("MSFT", "C:/myData/", "01/01/2006, "12/31/2016");
//Downloader.load();

import java.util.*;
import java.io.*;
import java.net.*;

public class Downloader extends Exception{

private String symbol;
private String directory;
private Date startDate, endDate;
private String fileName;
private String url = "http://chart.finance.yahoo.com/table.csv?s=GOOG&a=1&b=14&c=2013&d=3&e=14&f=2017&g=d&ignore=.csv";
	


public Downloader() throws Exception{
	
URL yahoo = new URL(url);
	
	BufferedReader reader = new BufferedReader(
			new InputStreamReader(yahoo.openStream()));
	
	  System.out.println(reader.readLine());
	
	
	//String fileName = "C:/Users/Haris/Desktop/NASDAQ.csv";
	//File file = new File(fileName);
   // Scanner reader = new Scanner(file);
    
	//reader.readLine();
	String row ;
	String[] line;
}


	public Downloader( String s, String d, String f, Date sD, Date eD){
		
		setSymbol(s);
		setDirectory(d);
		setStartDate(sD);
		setEndDate(eD);
		fileName = d + f;  
			
	}


	
	public boolean load(){
		//create URL a string
		
		String url = "http://chart.finance.yahoo.com/table.csv?s=";
		url += symbol + "&a=" + startDate.getMonth() + "&b= " + startDate.getDay() + "&c=" + startDate.getYear();
		//url += "&d=" + 3 "&e=" 14 + "&f=" 2017 ;
		url += "&g=d&ignore=.csv";
	}
	
	public String getSymbol(){
		return symbol;
	}
	public String getDirectory(){
		return directory;
	}
	public Date getStartDate(){
		return startDate;
	}
	public Date getEndDate(){
		return endDate;
	}
	
	public String getFileName(){
		return fileName;
	}
	
	
	//
	public void setSymbol(String s){
		symbol = s;
		
	}
	
	public void setDirectory(String d){
		directory = d;
		
	}
	public void setStartDate(Date sD){
		
		startDate = new Date(sD);
		
	}
	public void setEndDate(Date eD){
		
		endDate = new Date(eD);;
		
	}
	public void setFileName(String s){
		symbol = s;
		
	}
	

}
