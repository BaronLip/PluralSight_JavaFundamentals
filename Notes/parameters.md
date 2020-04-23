### Parameter immutability
* Parameters are passed by making a copy of the value.
* Changes made to the passed value is not visible outside of the method.

** Primitive Ex:**
```Java
// val1 & val2 values never change when being passed into swap(). 
// Memory is allocated for variables i and J.
// Then, val1 and val2 values are copied to i and j within the method.
int val1 = 10;
int val2 = 20;

void swap( int i, int j ) {
    // code block here.
}
```

** Class Ex:**
* for classes, the values are referenced instead of copied.
```Java
public class Flight {

    //Constructor:
    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    void swap(Flight i, Flight j) {
        // If we passed val1 as i and val2 as J,
        // i would "reference" the same class instance as val1, j would reference val2.
        // 
    }
}

Flight val1 = new Flight(10);
Flight val2 = new Flight(20);
```

### Constructor & method overloading
* Having multiple versions of constructors or methods is called *Overloading**.
* Each constructor or method must have a unique signature, made of 3 parts.
    1. Number of parameters.
    2. Type of parameters.
    3. Name.
* When chaining overload methods:
    1. The order doesn't matter. It does not have to be the first line.
    2. You may call another version of the method.  

### Variable number of parameters
**What if we don't know how many parameters are needed when calling a method?**
* Methods can be declared to accept a varying number of parameter values.
* Similar to the spread operator `...`, use `...` "ellipse" after the parameter name.
  * `Passenger...` instead of an array `Passenger[]`.
* **Must be the last parameter**.

```Java
public class Flight {
    // abridged for brevity.
    public void addPassenger ( Passenger... list ){
        if (hasSeating(list.length)) {
            passengers += list.length;
            
            for ( Passenger passenger : list ) {
                totalCheckedBags += passenger.getCheckedBags();
            }
        }
        else 
        {
            handleTooMany();
        }
    }

    private boolean hasSeating(int count) {
        return passenger + count <= seats;
    }
}

Flight f = new Flight();

Passenger janet = new Passenger(0, 1);
Passenger john = new Passenger(0, 2);
// Without `...` the method parameters look like this.
f.addPassengers( new Passenger[] { janet, john } );
// With `...` method parameters look like this.
f.addPassengers( janet, john );
```

### Key Points:
1. Parameters are immutable.
   * Changes made to passed value are not visible outside of method.
3. A class may have multiple constructors.
   * Each must have a unique signature.
   * Signature is made up of name, number of parameters type of parameters.
4. A method can be declared with varying number of parameters.
   * Values must be received as an array.
   * Must be last parameter.

