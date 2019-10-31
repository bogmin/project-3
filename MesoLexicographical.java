
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class MesoLexicographical extends MesoSortedAbstract
{
	private HashMap<String,Integer> asciiVal2 = new HashMap<>();
	public MesoLexicographical(HashMap<String,Integer> asciiVal) {
		this.asciiVal2 = asciiVal;
		sortedMap(asciiVal);
	}
	@Override
	Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted){
		Map<String,Integer> toReturn = new HashMap<>();
		TreeMap<String,Integer> forSorting = new TreeMap<>();
		forSorting.putAll(asciiVal2);
		for(HashMap.Entry<String,Integer> entry : forSorting.entrySet()) {
			toReturn.put(entry.getKey(),entry.getValue());
			System.out.println(entry.getKey());
		}
		return null;
		
		
	}
}