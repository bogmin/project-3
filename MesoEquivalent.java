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
	
		}

		

