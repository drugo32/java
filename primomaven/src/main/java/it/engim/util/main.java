package it.engim.util;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
public class main {

	public static void main(String[] args) throws ParseException  {
		
		System.out.println("Hello Date Example");
		// @deprecate
		// Date d = new Date(86,4,23);
		Date d = new Date();
		System.out.println(d);

		//SimpleDateFormat f = new SimpleDateFormat();
		SimpleDateFormat f = new SimpleDateFormat("Y * m * d HH:mm");
		f.setTimeZone(TimeZone.getTimeZone("Asia/Jakarta"));
		System.out.println(f.format(d));
		
		// Date myDate = new Date();
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy/M/d");
		try {
			Date myDate = df.parse("1986/05/23");
			System.out.println(myDate);
		}
		catch(ParseException e) {
			System.out.println("error!!");
		}
		/*
		catch (FileNotFound e) {
			System.out.println("error!!");
		}*/
		finally {
			System.out.println("THE end");
		}
		//System.out.println(myDate);
		/*	try {
			Date myDate = df.parse("1986-05-23");
		}  
		catch (e) {
			
		}
		*/

		
	}

}
