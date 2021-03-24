
/*
 * find out how to print time till 6 decimal precision
 */


package practice;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.time.*;
import java.sql.Timestamp;


public class HackCh {

	public static void main(String[] args) {
	    
		 LocalDate date = LocalDate.now();
		 
		 System.out.println(date);
		 
		 LocalTime time=LocalTime.now();
		 
		 Timestamp time1=new Timestamp(0);
		 
		LocalDateTime t1=time1.toLocalDateTime();
		System.out.println("==========================");
		System.out.println(t1);
		 
		System.out.println("==========================");
		 
		 
		 System.out.println(time);
		 
		 LocalDateTime dateTime=LocalDateTime.now();
		 
		 System.out.println(dateTime);
		 
		 LocalDate date2 = LocalDate.of(2021, 02, 28);  
		    LocalDateTime datetime = date2.atTime(14,16,07);
	
		    System.out.println("============================");
		    System.out.println(datetime);   
	     
	}

}
