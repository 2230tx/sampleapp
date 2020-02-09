
public class Test {

	private static int id;
	private static String name;
	private static double sal;

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

	public static double getSal() {
		return sal;
	}

	public static void setSal(double sal) {
		Test.sal = sal;
	}

	@Override
	public String toString() {
		return "Test []";
	}

	
}
