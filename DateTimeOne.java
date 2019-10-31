import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Collections;

public class DateTimeOne extends MesoDateTimeOneAbstract
{
	HashMap<String,String> timeOtherZones = new HashMap<>();
	HashMap<String,String> sortingGarbage = new HashMap<>();
	LocalDateTime date = LocalDateTime.now();
	
	public DateTimeOne() {
		
	}
	@Override
	public int getValueOfSecond() {
		System.out.println("The value of Second now: " + date.getSecond());
		return date.getSecond();
	}
		
	public void dateTimeNow() {
		date = LocalDateTime.now();
		DateTimeFormatter output = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm a");
		String dateTime = date.format(output);
		System.out.println("Current Date/Time: " + dateTime);
	}
	@Override
	void sleepForFiveSec() {
		try {
			TimeUnit.SECONDS.sleep(5);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
