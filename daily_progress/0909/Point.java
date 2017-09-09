public class Point {
	int x;
	int y;

	Point() {
		// Used to call Point(int x, int y)
		this(0,0);
	}

	Point(int x, int y) {
		this.x = y;
		this.y = y;
	}

	void printPoint() {
		System.out.println("(" + x + "," + y + ")");
	}

	// TODO: not understand why it does not work when public static void main()
	public static void main(String[] args) {
		System.out.println("-----hello world---");
	}

}

// To run:
// javac Point.java
// java Point
