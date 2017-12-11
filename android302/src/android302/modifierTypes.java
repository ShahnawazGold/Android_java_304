package android302;

public class modifierTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
///////////////////////////Access Modifiers/////////

//Java provides a number of access modifiers to set access levels for classes,
//variables, methods, and constructors. The four access levels are

//Visible to the package, the default. No modifiers are needed.
//Visible to the class only (private).
//Visible to the world (public).
//Visible to the package and all subclasses (protected).
		
////////////////Default Access Modifier  No Keyword
//Default access modifier means we do not explicitly declare an access modifier for a class, field, method, etc.

//A variable or method declared without any access control modifier is available to any other class in the same package. The fields in an interface are implicitly public 
//static final and the methods in an interface are by default public
//		
//		String version = "1.5.1";
//
//		boolean processOrder() {
//		   return true;
//		}
		
////////////////////////Private Access Modifier - Private//////////////////

//Methods, variables, and constructors that are declared private can only be accessed within the declared class itself.

//Private access modifier is the most restrictive access level. Class and interfaces cannot be private.

//Variables that are declared private can be accessed outside the class, if public getter methods are present in the class.

//Using the private modifier is the main way that an object encapsulates itself and hides data from the outside world.


//public class Logger {
//private String format;
//
//public String getFormat() {
//return this.format;
//}
//
//public void setFormat(String format) {
//this.format = format;
//}
//}

////////////////////////Public Access Modifier - Public///////////////////////

//A class, method, constructor, interface, etc. declared public can be accessed from any other class. Therefore, fields, methods, blocks declared inside a public 
//class can be accessed from any class belonging to the Java Universe.

//However, if the public class we are trying to access is in a different package,
//then the public class still needs to be imported. Because of class inheritance, all public methods and
//variables of a class are inherited by its subclasses.


//		public static void main(String[] arguments) {
//		// ...
//		}
		
///////////////////////////////Protected Access Modifier - Protected////////////////

//Variables, methods, and constructors, which are declared protected in
//a superclass can be accessed only by the subclasses in other package or any
//class within the package of the protected members' class.


//The protected access modifier cannot be applied to class and interfaces. Methods, 
//fields can be declared protected, however methods and fields in a interface cannot be declared protected.

//Protected access gives the subclass a chance to use the helper method or variable,
//while preventing a nonrelated class from trying to use it.

//		class AudioPlayer {
//		protected boolean openSpeaker(Speaker sp) {
//		// implementation details
//		}
//		}
//		
//		class StreamingAudioPlayer {
//		boolean openSpeaker(Speaker sp) {
//		// implementation details
//		}
//		}
		
		
////////////////Access Control and Inheritance
//The following rules for inherited methods are enforced 

//Methods declared public in a superclass also must be public in all subclasses.

//Methods declared protected in a superclass must either be protected or public in subclasses; they cannot be private.

//Methods declared private are not inherited at all, so there is no rule for them.


//////////////////////////////////////////////////////////Java  Non Access Modifiers////////////////////////
////////////////////////////Java  Non Access Modifiers/////////////////////////////////////////\
		
		
		
		// Java provides a number of non-access modifiers to achieve many other functionalities.

		// The static modifier for creating class methods and variables.

		// The final modifier for finalizing the implementations of classes, methods, and variables.

		// The abstract modifier for creating abstract classes and methods.

		// The synchronized and volatile modifiers, which are used for threads

		
		
		
//////////////////////////////The Static Modifier/////////////

//Static Variables
//The static keyword is used to create variables that will exist independently of any instances created for the class. Only one copy of the static variable exists regardless of the number of instances of the class.

//Static variables are also known as class variables. Local variables cannot be declared static.


//Static Methods
//The static keyword is used to create methods that will exist independently of any instances created for the class.

//Static methods do not use any instance variables of any object of the class they are defined in. Static methods take all the data from parameters and compute something from those parameters, with no reference to variables.

//Class variables and methods can be accessed using the class name followed by a dot and the name of the variable or method.

		
		
//////////////////////The Final Modifier/////////////

//Final Variables
//A final variable can be explicitly initialized only once.
//A reference variable declared final can never be reassigned to refer to an different object.

//However, the data within the object can be changed. So, the state of the object can be changed but not the reference.
//public class Test {
//final int value = 10;
//
//// The following are examples of declaring constants:
//public static final int BOXWIDTH = 6;
//static final String TITLE = "Manager";
//
//public void changeValue() {
//value = 12;   // will give an error
//}
//}
//
//public class Test {
//public final void changeName() {
//// body of method
//}
//}
//
///////////Final Classes
//public final class Test {
//// body of class
//}
		
		
//////////////////////////The abstract Modifier///////////////////////


//An abstract class can never be instantiated. 
//If a class is declared as abstract then the sole purpose is for the class to be extended.

//A class cannot be both abstract and final (since a final class cannot be extended). If a class contains abstract methods
//then the class should be declared abstract. Otherwise, a compile error will be thrown



//abstract class Caravan {
//private double price;
//private String model;
//private String year;
//public abstract void goFast();   // an abstract method
//public abstract void changeColor();
//}

		
///////////////////////Abstract Methods/////////


//An abstract method is a method declared without any implementation. 
//The methods body (implementation) is provided by the subclass. Abstract methods can never be final or strict.

//Any class that extends an abstract class must implement all the 
//abstract methods of the super class, unless the subclass is also an abstract class.

//If a class contains one or more abstract methods, then the class 
//must be declared abstract. An abstract class does not need to contain abstract methods.

//The abstract method ends with a semicolon. Example: public abstract sample();



//public abstract class SuperClass {
//abstract void m();   // abstract method
//}
//
//class SubClass extends SuperClass {
//// implements the abstract method
//void m() {
//.........
//}
//}
		
		
		
		
		
		

		


	}

}
