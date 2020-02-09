
public class Test {

	private static int id;
	private static String name;
	

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Test.id = id;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Test.name = name;
	}

	@Override
	public String toString() {
		return "Test []";
	}

	
}
