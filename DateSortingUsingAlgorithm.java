import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class DateSortingUsingAlgorithm {
	HashMap<LocalDate,Integer> comparing = new HashMap<>();
	public DateSortingUsingAlgorithm() {
		
	}
	public void readIn() throws IOException{
		int i = 0;
		BufferedReader reader = new BufferedReader(new FileReader("Dates.txt"));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String date = reader.readLine();
		LocalDate datum = null;
		while (date != null) {
			String cut = date.trim().substring(0,10);
			datum = LocalDate.parse(cut,formatter);
			i++;
			comparing.put(datum,i);
			date = reader.readLine();
		}
		reader.close();
	}
	public void dateHashMapSortedDescending() {
		
	}
	public void dateHashMapSorted() {
		
	}
}
