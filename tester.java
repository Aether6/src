public class tester {
	public static void main(String[] args) {
		Grid test = new Grid();
		System.out.println(test.print());
		
		test.setSymbolOf("one", "cross");
		System.out.println(test.getSymbolof("one"));
		
		System.out.println(test.print());
		
	}
}
