import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class CalendarDemo {
public static void main(String[] args) {
		Calendar cal= Calendar.getInstance();
		Date date= cal.getTime();
		SimpleDateFormat sm= new SimpleDateFormat("yyyy-mm-dd");
		System.out.println(sm.format(date));
}
}
