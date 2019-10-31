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
}



