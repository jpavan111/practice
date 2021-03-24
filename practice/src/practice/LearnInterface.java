package practice;

/*
 * In Interface we just have declaration of methods That is everything is
 * "public abstract" by default. We "have to" provide definition for those 
 * methods in the class implementing that interface.
 * 
 * Reference variable of type interface can hold the object of class
 * which is implementing that interface.
 * 
 * We can implement multiple interfaces to single class
 * 
 * There are 3 types if interface: 
 * 1.Marker Interface ==> Without any Method.
 * 2.SAM ==> Single Abstract Method ==> Functional Interface.
 * 3.Normal
 * 
 */

interface Abc {

	void show();
}

/*
 * //Standard way of implementing. class AbcImplement implements Abc{
 * 
 * public void show(){ System.out.println("implementing Abc show"); }
 * 
 * }
 */

public class LearnInterface {

	public static void main(String[] args) {

		/*
		 * implementing interface with anonymous innner class. here we dont define class
		 * seperately but directly give implementation we are doing so since the whole
		 * point of defining that implementing class was just to implement the interface
		 * functions.
		 */

		Abc obj = new Abc() {
			public void show() {
				System.out.println("implementing Abc show");
			}
		};

		obj.show();

	}
}

/*
 * Specially for Functional interface(SAM) lambda expression can be used to give
 * definition.
 * 
 * Abc obj=() -> System.out.println("implementing Abc show");
 *
 * obj.show();
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
