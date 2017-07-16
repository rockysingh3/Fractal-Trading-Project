//This class is downloading historical data for a specific stock starting at a date and finishing at specific date.
//the data is going to  be saved in a specified directory  as csv file. The name of the file will be Symbol_Daily.csv
// Downloader ("MSFT", "C:/myData/", "01/01/2006, "12/31/2016");
//Downloader.load();

import java.util.*;
import java.io.*;
import java.net.*;

public class YahooData extends Exception{

private String symbol;
private String directory;
private Date startDate, endDate;
private String fileName;
//private String url = "http://chart.finance.yahoo.com/table.csv?s=GOOG&a=1&b=14&c=2013&d=3&e=14&f=2017&g=d&ignore=.csv";
	

	public YahooData(String s, String d, Date st, Date end){
	symbol = s;
	directory = d;
	startDate = new Date(st);
	endDate = new Date(end);
	fileName = directory + symbol + "_Daily.csv";
}

	public YahooData( String s, String d, String f, Date sD, Date eD){
		
		setSymbol(s);
		setDirectory(d);
		setStartDate(sD);
		setEndDate(eD);
		fileName = d + f;  
			
	}


	
	public boolean load() throws Exception{
		//create URL a string
		
		String url = "http://chart.finance.yahoo.com/table.csv?s=";
		url += symbol + "&a=" + startDate.getMonth() + "&b= " + startDate.getDay() + "&c=" + startDate.getYear();
		url += "&d=" + endDate.getMonth() + "&e=" + startDate.getDay() + "&f=" + startDate.getYear() ;
		url += "&g=d&ignore=.csv";
		
		
		URL finance = new URL(url);
		
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(finance.openStream()));
		
		reader.readLine();
		Vector<Bar> Bars = new Vector <Bar>(1000, 100); 
		String row ;
	
		
		while((row = reader.readLine())!= null){
			
				//line = row.split(",");
		
			//b1.setOpen(Float.parseFloat(line[1]));
				
				Bar bar1 = new Bar(row);
				Bars.add(bar1);
		
	    }
		
		reader.close();
		
		return true;
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
