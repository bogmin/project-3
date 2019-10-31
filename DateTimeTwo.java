import java.util.Date;
import java.util.HashMap;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class DateTimeTwo {
	private LocalDateTime date = LocalDateTime.now();
	int year = date.getYear();
	int month = date.getMonthValue();
	int ten = 10;
	int eighteen = 18;
	HashMap<LocalDate,Integer> comparing = new HashMap<>();
	public DateTimeTwo() {
		
	}
	public void daysOfCurrentMonth() {
		String output1 = String.format("%d-%d-%d", year, month, ten);
		Date dateIndividual = null;
		try {
			dateIndividual = new SimpleDateFormat("yyyy-M-d").parse(output1);
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		String output2 = String.format("%d-%d-%d", year, month, eighteen);
		Date dateIndividual2 = null;
		try {
			dateIndividual2 = new SimpleDateFormat("yyyy-M-d").parse(output2);
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(dateIndividual);
		String dayOfWeek2 = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(dateIndividual2);
		System.out.println("The tenth day of this month is " + dayOfWeek.toUpperCase() + " and eighteenth is " + dayOfWeek2.toUpperCase());
	}
	


