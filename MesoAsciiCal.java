
public class MesoAsciiCal extends MesoAsciiAbstract 
{
	MesoStation station;
	private int results = 0;
	int normanAverage = 0;
	int stIDAverage = 0;
	final String NORMAN = "NRMN";
	public MesoAsciiCal(MesoStation stID) {
		this.station = stID;
	}
	public int firstAvg() {
		double f = 0;
		for (int i = 0; i < station.getStID().length(); i++) { 
            f = f + (int)station.getStID().charAt(i); 
        } 
		f = f / station.getStID().length();
		stIDAverage = (int)Math.ceil(f);
        return stIDAverage;
	}
	public int secondAvg() {
		double g = 0;
		for (int i = 0; i < NORMAN.length(); i++) { 
            g = g + (int)NORMAN.charAt(i); 
        } 
		g = g / NORMAN.length();
		normanAverage = (int)Math.ceil(g);
        return normanAverage;
	}
	@Override
	int calAverage() {
		int[] values = new int[station.getStID().length()];
		double avg = 0;
		
		for(int i = 0; i < station.getStID().length(); ++i) {
			char letter = station.getStID().charAt(i);
			int ascii = (int) letter;
			values[i] = ascii;
		}
		for(int i = 0; i < values.length; ++i) {
			avg = avg + values[i];
			}
		avg = avg / values.length;
		results = (int) Math.ceil(avg);
		return results; 
		
	}
   
}