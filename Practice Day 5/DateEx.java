import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateEx {
	public static void main(String[] args) {
		
	
String str_date= "20-04-1992";
DateFormat formatter= new SimpleDateFormat("dd-mm-yyyy");

try {
	Date date= (Date)formatter.parse(str_date) ;
	System.out.println(date);
} catch (ParseException e) {
	
	e.printStackTrace();
}
}}
