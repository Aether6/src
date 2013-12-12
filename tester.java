public class tester {
	
	public static void main(String[] args) {
		
		Grid test = new Grid();
		System.out.println(test.print());

		test.setSymbolOf("one", "cross");
		test.setSymbolOf("two", "cross");
		test.setSymbolOf("three", "cross");
		test.setSymbolOf("seven", "circle");
		test.setSymbolOf("nine", "circle");
		System.out.println(test.getSymbolof("one"));

		System.out.println(test.print());

	}
}
