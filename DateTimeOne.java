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
	@Override
	void dateTimeOfOtherCity() {
		System.out.println(String.format("Time on Server: %02d:%02d", date.getHour(),date.getMinute()));
		System.out.println("GMT: " + date.atZone(ZoneId.of("Asia/Karachi")).format(DateTimeFormatter.ofPattern("h:mm").withZone(ZoneOffset.UTC)));
		System.out.println("BST (90E): " + date.atZone(ZoneId.of("Asia/Dhaka")).format(DateTimeFormatter.ofPattern("h:mm").withZone(ZoneOffset.UTC)));
		System.out.println(String.format("CST (90W): %02d:%02d", date.getHour(),date.getMinute()));
		
	}
	@Override
	void dateTimeDifferentZone() {
		System.out.println("GMT: " + date.atZone(ZoneId.of("Asia/Karachi")).format(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm").withZone(ZoneOffset.UTC)));
		System.out.println("BST: " + date.atZone(ZoneId.of("Asia/Dhaka")).format(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm").withZone(ZoneOffset.UTC)));
		System.out.println(String.format("CST: %02d/%02d/%04d %02d:%02d", date.getMonthValue(), date.getDayOfMonth(), date.getYear(), date.getHour(), date.getMinute()));
		
		timeOtherZones.put("GMT", date.atZone(ZoneId.of("Asia/Karachi")).format(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm").withZone(ZoneOffset.UTC)));
		timeOtherZones.put("BST", date.atZone(ZoneId.of("Asia/Dhaka")).format(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm").withZone(ZoneOffset.UTC)));
		timeOtherZones.put("CST", date.atZone(ZoneId.of("US/Central")).format(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm").withZone(ZoneOffset.UTC)));
		
//		for(HashMap.Entry<String,String> entry : timeOtherZones.entrySet()) {
//			System.out.println(entry.getKey() + ": " + entry.getValue());
//		}
		
	}
	@Override
	void timeZoneHashMap() {
		timeOtherZones.put("AST","10/01/2020 19:59");
		timeOtherZones.put("ZST","11/05/2018 19:59");
		for(HashMap.Entry<String,String> entry : timeOtherZones.entrySet()) {
			sortingGarbage.put(entry.getValue(),entry.getKey());
	}
		LocalDateTime[] why = new LocalDateTime[5];
		int i = 0;
		for(HashMap.Entry<String,String> entry : sortingGarbage.entrySet()) {
			String now = entry.getKey();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
			LocalDateTime formatDateTime = LocalDateTime.parse(now,formatter);
			why[i] = formatDateTime;
			++i;
		}
		System.out.println("Print Style 1:");
		TreeMap<String,String> sorting = new TreeMap<>();
		sorting.putAll(timeOtherZones);
		for(HashMap.Entry<String,String> entry : sorting.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("Print Style 3:");
		for(HashMap.Entry<String,String> entry : sorting.entrySet()) {
			System.out.println(entry.getValue());
		}
		System.out.println("Print Style 5: Final sorted Array:");
		Arrays.sort(why, Collections.reverseOrder());
		for(int j = 0; j < why.length; ++j) {
			System.out.println(why[j]);
		}
		}
	}
