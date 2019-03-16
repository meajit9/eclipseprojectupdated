package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Date1 {
	
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		String date = sdf.format(new Date());
		System.out.println(date); //Prints 26/10/2015
	
		
		/*SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "15-10-2015 10:20:56";
		Date date = sdf.parse(dateInString);
		System.out.println(date); //Prints Tue Oct 15 10:20:56 SGT 2015
*/		
		
		/*SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //2015/10/26 12:10:39	
*/		
		
		/*LocalDate today = LocalDate.now();
		System.out.println("Today's Local date : " + today);*/
		
		/*Calendar calendar = Calendar.getInstance();
		Date date =  calendar.getTime();
		System.out.println(date.getTime());
		System.out.println(date.getDate());
		System.out.println(date.getDay());
		System.out.println(date);
		System.out.println(new Date());*/
		
		/*Date date1 = new Date();
		Date date2 = new Date();
		 
		int comparison = date1.compareTo(date2);
		System.out.println(comparison);*/
		
		LocalDate today = LocalDate.now();
	/*	System.out.println(today);
		LocalDate date1 = LocalDate.of(2015, 10, 26);
		System.out.println(date1);
		if(date1.equals(today)){
		    System.out.printf("Today %s and date1 %s are same date %n", today, date1);
		}*/
	
	}

}
