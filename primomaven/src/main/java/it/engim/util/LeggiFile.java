package it.engim.util;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class LeggiFile {
	
	public static Date GetString(String Line, SimpleDateFormat ReadFormat ) throws ParseException {
		return ReadFormat.parse(Line); 
	}
	
	public static String StampaData(Date myDate, SimpleDateFormat Outformat) throws ParseException {
		return Outformat.format(myDate);			
	}
	
	public static Scanner ReadFile(String name) {
		Scanner s = new Scanner(System.in);
		try {	
			File f = new File(name);
			s = new Scanner(f);
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found! /tmp/test.txt");
		}
		return s;
	}
	
	public static void main(String[] args)  throws FileNotFoundException {
	
		Scanner s = ReadFile("/tmp/test.txt");
		SimpleDateFormat ReadFormat = new SimpleDateFormat("yyyy/M/d");
		SimpleDateFormat Outformat = new SimpleDateFormat("M d");

		while(s.hasNextLine()) {
			String Line = s.nextLine();
			try {
				Date myDate = GetString(Line, ReadFormat);
				System.out.println(myDate);
				System.out.println(StampaData(myDate, Outformat));			
			}
			catch(ParseException e) {
				System.out.println("error!! data parser");
			}

		}
		//}
		//catch(FileNotFoundException e) {
		//	System.out.println("File not found! /tmp/test.txt");
		//} 

		//finally{
		s.close();	
		//}
	}

}
