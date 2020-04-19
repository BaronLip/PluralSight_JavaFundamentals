### Encapsulation
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