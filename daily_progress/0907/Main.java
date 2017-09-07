public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

	int myNumber = 5;

	String s1 = new String("Who let the dogs out?");

	boolean b = false;

	if (b) {
		    System.out.println("it is true");
	}

	if (a == b) {
		    // We already know this part
	} else {
		    // a and b are not equal... :/
        }

	// Correct, same as above
	if (a == b) System.out.println("Yeah!");
	else System.out.println("Ohhh...");

	// Correct, same as above
	if (a == b)
		    System.out.println("Another line Wow!");
	else
		    System.out.println("Double rainbow!");

	boolean r1 = a == b;      // 返回false, 因为ab不是同一个对象
	boolean r2 = a.equals(b); // true, ab的内容是一样的
	boolean r3 = a == sameA;  // true, a 和 sameA 就是同一个对象

    }
}
