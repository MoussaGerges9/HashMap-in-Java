import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1220, "Liam");
		map.put(1221, "Noah");
		map.put(1222, "Oliver");
		map.put(1223, "Noah");
		map.put(1224, "Matthew");
		map.put(1225, "Joseph");

		System.out.println("Initialized map: " + map);
		System.out.println("Current map size: " + map.size());

		// Replace values
		map.put(1222, "Luca");
		map.replace(1224, "Jose");
		System.out.println("Map after modifying: " + map);

		if (map.containsKey(1224))
			System.out.println("Value with key = 1224: " + map.get(1224));

		map.remove(1225);
		System.out.println("Map after removing key = 1225: " + map);
	}

}
