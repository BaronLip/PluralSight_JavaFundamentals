### Java is an object oriented language.

Objects encapsulate data, operations and usage semantics.
* Allows storage and manipulation details to be hidden.
* Separates "What" is to be done from "How" it is done.

**Classes** provide the structure to create an object.
* A class is a template for creating an object.
* Java source file name conventionally has the same name as the class.
	* Person.java is the filename for the class of "Person".
* Classes are written in Pascal Case, with the first letter capitalized.
* Body of the class is contained within brackets.
* Class is made up of:
	1. State
		* Fields - store object state. Basically variables.
	2. Executable code/ Statements.
		* Methods - executable code that manipulates state and performs operations.
	3. Constructors
	 	* Executable code used during the object's creation to set the intial state.
* Declaring a class variable only allocates memory/space referencing that class.
* The **new** keyword is needed to create the object and fill that memory/space.
* The class variable is always a **reference** to the Class object but not the Class object itself.
* Primitive data types copy the values vs. Complex types reference the values.

**Ex: of Class components**
```Java
class Flight { //Flight is an arbituary name. 
	// These would be State fields.
	int passesngers;
	int seats;
	
	// Constructor instantiates a FLight with state of seats and passenger count.
	Flight() {
		seats = 150;
		passengers = 0;
	}
	
	// Method within Flight class.
	void add1Passenger() {
		if (passengers < seats) {
			passengers += 1
		}
	}
	
}
```

** Use the **"new"** keyword to instantiate a class object.**
**Ex:**
```Java
// Instantiate a new Flight object with the "new" keyword.
// This creates a reference to the Flight object, now called nycToSF.
// It is not the same object as Flight.

Flight nycToSF; // This creates a variable just like "int number;".
nycToSF = new Flight(); // Then instantiate a reference to the Flight object using "()" and assign to the variable.

// Better in one line.
Flight slcToDallas = new Flight();

// Use dot notation to invoke class methods.
slcToDallas.add1Passenger();

// Also use dot notation to reference the state, class variables.
slc.passengers // 0.
```

### Class variables are **"references"** to "the" Class object.
When assigning classes, references are assigned and not the actual object.

**Ex:**
```Java
Flight flight1 = new Flight();
Flight flight2 = new Flight();

flight2.add1Passenger();
flight2.passengers; // 1

// assign the reference of flight1 to flight2.
flight2 = flight1;

// flight2 now references the same flight as flight1.
// flight2 "goes away" since there is no reference to that memory anymore.
// Since flight 2 now references flight1, values of flight2 are the same as flight1. They are two variables referencing the same object. 
flight2.passengers; // 0

flight1.add1Passenger(); // 1
flight1.add1Passenger(); // 2

// Because they reference the same space of memory, their values are the same.
flight2.passengers; // 2

```

### Encapsulation & Access modifiers:
* Encapsulation is a concept of accessing the internals of a Class object.
* **Access Modifiers** are used to achieve encapsulation.
* Access modifiers determine the scope of the internals.

**Access Modifier types:**
* no access modifier - "package private", only viewable in it's own package.
* public - visible everywhere.
	* public classes required:
		1. to be located within the source "src" folder.
		2. to have the same name as the class. Class Flight = Flight.java.
* private - only within its own class.

**Ex:**
```Java
// The "public" access modifier allows the Flight class to be accessed anywhere.
public class Flight {
	private int passengers;
	private int seats;
	
	// Constructor is also set as public:
	public Flight() {
		seats = 150;
		passengers = 0;
	}
	
	public void add1Passenger() {
		if (passengers < seats) {
			passengers += 1;
		}
		else {
			handleTooMany();
		}
	}
	
	private void handleTooMany() {
		System.out.println("Too Many");
	}
}

Flight flight1; // is available outside of the class since Flight, as a class, is public.

flight1.passengers; // is NOT allowed since they are set to private.

flight1.add1Passenger(); // is available since it is public.

flight1.handleTooMany(); // is NOT available since it is private. However, in case there are too many passengers, add1Passenger() is able to access handleToMany() since add1Passenger is inside of the class.
```

### Methods:
Methods are executable code that manipulates state and performs operations.
Parts:
1. return-type
2. name
Return-type is `void` if no value is returned.

**Syntax:**
```Java
return-type name (typed-parameter-list ) {
	body statements; // { curly brackets } are REQUIRED for designating method statements.
};
```

**Ex:**
```Java
public class MyClass {}
	
	public void showSum (float x, float y, int count) {
		float sum = x + y;

		for (int i = 0; i < count; i++) {
			System.out.println(sum);
		}
	}
}

MyClass m = new MyClass(); // Create a new instance of MyClass and reference it with memory name m. 
m.showSum(7.5, 1.4, 3); // m.showsum() calls the publically accessable showSum() method with parameters. Result is 8.9 8.9 8.9.
```

### Return Values:
Methods return a single value. They may be:
1. Primitive value.
2. reference to an object.
3. reference to an array of objects.

```Java
public class Flight {
	private int passengers;
	private int seats;
	// removed constructor for brevity.
	
	public boolean hasRoom(Flight f2) {
		int total = passengers + f2.passengers;
		
		// Refactored of the below code:
		return total <= seats;
		// if (total <= seats)
			// return true;
		// else
			// return false;	
	}
	
	public Flight createNewWithBoth(Flight f2) {
		
		Flight newFlight = new Flight();
		// Breakdown of above:
		// data-type = Flight
		// newFlight = name of variable.
		// assignment operator.
		// value of a new Flight class instance.
		
		newFlight.seats = seats;
		newFlight.passengers = passengers + f2.passengers;
		return newFlight;		
	}
}

// Utilize the above Flight class:
Flight lax1 = new Flight();
Flight lax2 = new Flight();
// add passengers to both flights.

Flight lax3; // This is just a reference but not assignment of new Flight(). 	

if (lax1.hasRoom(lax2))
	lax3 = lax1.createNewWithBoth(lax2);
// Refer to the createNewWithBoth() method.
// lax3 is assigned a new Flight() instance with the combined passengers of lax1 & lax2.
```