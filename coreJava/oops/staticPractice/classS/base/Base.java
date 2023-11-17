package staticPractice.classS.base;

public class Base{

    public static void testOuterMethod(){
		System.out.println("Value of inner class variable: "+Inner.x);
		Inner.testingInnerMethod(); // it will call the Inner class method ;
	}

    // we cannot declare a outer class as static because a static class 
    // cannot be imported to another class and it doesn't be a parent class 
    // any other classes ;
	
    // but we can create a inner static class ;

	public static class Inner {
        public static int x = 5; // since it is a static variable it is available to entire class ;
		public static void testingInnerMethod() {
			System.out.println("Testing inner class method.");
		}
	}

}