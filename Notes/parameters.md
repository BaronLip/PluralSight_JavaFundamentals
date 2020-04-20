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

### Variable number of parameters
