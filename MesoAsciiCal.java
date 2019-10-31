
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
