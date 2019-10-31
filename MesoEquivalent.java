import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MesoEquivalent {
	String[] stationNames = new String[120];
	int avgToFind = 0;
	
	public MesoEquivalent(String stID) {
		int avg = 0;
		MesoAsciiCal finder = new MesoAsciiCal(new MesoStation(stID));
		avg = finder.calAverage();
		this.avgToFind = avg;
	}
	public void readIn() throws IOException{
		int i = 0;
		BufferedReader reader = new BufferedReader(new FileReader("Mesonet.txt"));
		String stations = reader.readLine();
		stations = reader.readLine();
		stations = reader.readLine();
		stations = reader.readLine();
		while(stations != null) {
			String cut = stations.trim().substring(0,4);
			stationNames[i] = cut;
			i++;
			stations = reader.readLine();
		}
	}
	
	public HashMap<String,Integer> calAsciiEqual() throws IOException {
		readIn();
		HashMap<String,Integer> ascii = new HashMap<String,Integer>();
		int newAvg = 0;
		for(int i = 0; i < stationNames.length; ++i) {
			MesoAsciiCal newFind = new MesoAsciiCal(new MesoStation(stationNames[i]));
			newAvg = newFind.calAverage();
			if(newAvg == avgToFind) {
				ascii.put(stationNames[i],newAvg);
			}
			}
		return ascii;
		}
		}

		

