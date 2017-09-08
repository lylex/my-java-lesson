public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

	int[] arr;
	System.out.println(arr.length);

	arr = new int[10];
	System.out.println(arr.length);

	int[] arr = {1, 2, 3, 4, 5};

	// Loop
	for (int i = 0; i < 3; i++) {}

	int i = 1;
	while (i == 0) {}

	// for each
	int[] arr = {2, 0, 1, 3};
	for (int el : arr) {
		    System.out.println(el);
	}

	// equivalent to the bellow
	int[] arr = {1, 9, 9, 5};
	for (int i = 0; i < arr.length; i++) {
		    int el = arr[i];
		        System.out.println(el);
	}


	// break and continue
	int i;
	for (i = 0; i < 5; i++) {
           if (i >= 3) {
	       break;
	   }
           System.out.println("Yuhu");
           if (i >= 1) {
               continue;
           }
           System.out.println("Tata");
	}
        System.out.println(i);

    }
}
