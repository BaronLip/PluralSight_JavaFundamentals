### This and null keywords:
**`this`:**
1. is an implicit reference to the current object.
* reduced ambiguity
* allows an object to pass itself as a parameter.


**`null`**
* Represents an uncreated object.
* Can be assigned to any reference variable.

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

Flight lax3 = null;
// This is just a reference but not assignment of new Flight(). 	
// Local variables must be initialized. So, assign it to null in order to bypass empty initialization.

if (lax1.hasRoom(lax2))
	lax3 = lax1.createNewWithBoth(lax2);
// Refer to the createNewWithBoth() method.
// lax3 is assigned a new Flight() instance with the combined passengers of lax1 & lax2.

if (lax3 != null) // if lax3 is NOT null, then we know the flights were combined. 
	System.out.println("Flights combined");
```