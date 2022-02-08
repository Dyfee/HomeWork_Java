class HomeWorkApp {
	public static void main(String[] args) {
		printThreeWords();
		checkSumSign();
		printColor();
		compareNumbers();
	}
	public static void printThreeWords() {
		System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Apple");
	}
	public static void checkSumSign() {
		int a = 10, b = 20;
		int sumNum = a + b;
		System.out.println(sumNum >= 0? "Summa polojitelnaya" : "Summa otricatelnaya");
	}
	public static void printColor() {
		int value = 25;
		if (value <= 0) {
			System.out.println("Krasnyi");
		} if (value > 0 && value <= 100) {
			System.out.println("Zheltyi");
		} if (value > 100) {
			System.out.println("Zelenyi");
		}
	}
	public static void compareNumbers() {
		int a = 40, b = 30;
		if (a >= b) {
			System.out.println("a >= b");
		} else {
			System.out.println("a < b");
		}
	}
}