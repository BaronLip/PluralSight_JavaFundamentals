### Encapsulation:
* prevents access to fields/variables. within a class from outside of the class.
* Helps hide the implementation of details.
* Use methods to control access to the fields within a class.

### Accessors and Mutators:
is a common pattern to control field access.

Accessor
~ or **Getter**, is a method that retrieves a field value.
~ Commonly named getFieldName().

Mutator
~ or **Setter**, modifies the field value.
~ Commonly named setFieldName().
~ Using "this" can help clarify the field value from the parameter value of the same name.

**EX:**
```Java
public class Flight {
	// NOTE: these fields are private. 
	// With getter and setter methods, these values are now accessible.
	private int passengers;
	private int seats;
		
	// This is a getter method.
	public int getSeats() {
		return seats;
	}
	
	// This is a setter method.
	// Note: it takes a parameter.
	// Note: "this" is used to clarify the field seats from the parameter seats.
	public void setSeats(int seats) {
		this.seats = seats;
	}
}

// UTILIZING GETTER AND SETTER METHODS:
// Create new class instance.
Flight slcToNyc = new Flight();
// Use setter method to set seat count.
slcToNyc.setSeats(150);
// Use getter method to retrieve field value.
System.out.println(slcToNyc.getSeats()); // 150
```

### Initialization Blocks:
initialization blocks run a code block at time of instantiation.
```Java
public class Flight {
	// INITIAL VARIABLES/VALUES:
	private int passengers, flightNumber, seats = 150;
	private char flightClass;
	private boolean[] isSeatAvailable;

	// CONSTRUCTORS:
	// Instead of using repeated code within constructors, `this()`, use initialization blocks.
	// Constructors without initialization blocks:
	public Flight() {
		isSeatAvailable = new boolean[seats];
		for (int i = 0; i < seats; i++) {
			isSeatAvailable[i] = true;
		}
	};

	public Flight(int flightNumber) {
		this();
		this.flightNumber = flightNumber;
	}
	public Flight(char flightClass) {
		this();
		this.flightClass = flightClass;
	}

	// Constructor with initialization block:
	// This block automatically runs when an instance of this class is initialized.
	// The original constructors can remain the same.
	{
		isSeatAvailable = new boolean[seats];
		for (int i = 0; i < seats; i++) {
			isSeatAvailable[i] = true;
		}
	}
	public Flight() {}
	public Flight(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public Flight(char flightClass) {
		this.flightClass = flightClass;
	}
}	
```

### Order of operations when a class instance is created:
1. Field initialization - all the variables are created.
2. Initialization blocks - the block of code between curly brackets will run.
3. Constructor - will be called to finalize creation of the instance.

### Key points:
1. Objects should be created in some useful state.
2. Field initializers provide initial values at time of declaration.
3. Every class has one constructor, If there is not explicit, then there is a default.
4. It's possible to create multiple constructors with different parameters to cover how might an instance be created.
5. One constructor may call another, but, it must be the first line.
6. Initialization blocks share code across constructors.
7. Keep initialization order in mind when instanciating a class object.
   * Field initialization.
   * Initialization block.
   * Constructor(s). 