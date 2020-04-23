### Inheritance Basics:
* Object oriented classes can inherit, or derive, from another class.
* **extends** keyword is used to inherit from another class.
* A derived class has all the base characteristics, then adds it's own specialization.
  * Can be assigned to base class type references.
* Fields in the derived class will hide the field (with the same name) in the base class.
**Ex:**
```Java
// Create a class that extends from Flight class:
public class CargoFlight extends Flight {
    float maxCargoSpace = 1000.0f;
    float usedCargoSpace;

    public void add1Package(float h, float w, float d){
         double size = h * w * d;

         if (hasCargoSpace(size)) {
             usedCargoSpace += size;
         } else {
             handleNoSpace();
         }
    }

    private boolean hasCargoSpace(float size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }

    private void handleNoSpace() {
        System.out.println("Not enough space");
    }
}

// Utilize the extended class, CargoFlight.
CargoFlight cf = new CargoFlight();
cf.add1Package( 1.0, 2.5, 3.0 ); // 7.5

// Because cf inherits from Flight, it can also add a passenger.
Passenger jane = new Passenger(0, 2);
cf.add1Passenger(jane);

// This would not work well and would still only be a class of Flight.
Flight f = new CargoFlight();
Passenger jane = new Passenger(0, 2);
f.add1Passenger(jane);
f.add1Package(1.0, 2.5, 1.5); //Would not work.

// However, Creating an array of the base class allows all standard Flight functions to work.
Flight[] squadron = new Flight[5];

squadron[0] = new Flight();
squadron[1] = new Flight();
squadron[2] = new Flight();
squadron[3] = new CargoFlight();
squadron[4] = new CargoFlight();
// Now, there is multiple Flight class objects. Some with added functionality of CargoFlight.
// All standard Flight class functions would work.
```

### Member hiding and overriding:
* **Hiding fields** is very dangerous as it doesn't accurately represent the class fields when inheriting.
* Identical Fields between a Base Class and Derived Class can be dangerous as the field value used is dependant on which Class the method is contained in.
  * The field value within the same class is used. 
  * If the method of the Base Class is called the Base Field value will be used.
  * If the method of the Derived Class is called the Derived Field value is used.
* **Methods override Base Class methods**
  * When a Derived Class method has the same name as the Base Class method, the Derived Class method will override the Base Class method.
  * Java determines which getSeat() method to use based on the object created, not the type of reference used.
  * **@Override** signals to Java that the intent of this method is to override.
    * Has no affect on run time and is only used during compile time.

**Ex:**
```Java
public class Flight {
    // code abridge for brevity.
    // INSTEAD OF VARIABLES USE METHODS TO MAINTAIN THE VALUES.
    // int passengers; // Becomes:
    int getSeats() {
        return 150;
    }
    // int seats = 150;
    
    public void add1Passenger(){
        if (hasSeating()) 
            passengers += 1;
        else
            handleTooMany();
    }

    // // This method changes to invoke getSeats();
    // private boolean hasSeating() {
    //     return passenger <  seats;
    // }

    private boolean hasSeating() {
        return passenger < getSeats();
    }
}

public class CargoFlight {
    int getSeats() {
        return 12;
    }
}

Flight f1 = new Flight();
System.out.println(f1.seats); // 150

CargoFLight cf = new CargoFlight();
System.out.println(cf.seats); //  12

// THIS IS THE ISSUE: 
Flight f2 = new CargoFlight();
System.out.println(f2.seats); // This is 150 is because the seats value of 12 is only visible when worked with as a CargoFlight.
// Because f2's reference type is a Flight class. It only knows the seats of a Flight class.
// When calling ⬇,
f2.add1Passenger(); // => 150.
// add1Passenger() checks hasSeating() which checks seats variable. Since hasSeating is within the Flight class, the value of seats is 150.

// TO AVOID THIS CONFUSING BEHAVIOR, USE METHOD OVERRIDING.
Flight f3 = new CargoFlight();
f3.getSeats(); // => 12 
// the getSeats() method in CargoFlight overrides the getSeats() method in Flight.
// Java determines which getSeat() method to use based on the object created, not the type of referenced used.
// Since the f3 is an instance of CargoFlight, CargoFlight's getSeats() method is used.  
```

### Object class:
* Object class is the root of Java hierarchy.
  * Every class has the characteristics of Object class.
    * Either directly or indirectly.
    * Every class "extends" Object.
* The Reference Type determines Reference environment.
  * **Ex:**
    ```Java
    Object o = new CargoFlight();
    o.add1Package(1.0, 2.5, 3.0); // Will not work. 
    ```
    * o points to a Passenger class.
    * However it only is able to access the behaviors of the Object class because that is the reference type.
* Reassign the Reference Type to attain the behaviors of a particular class.
  * **Ex:**
    ```Java
    CargoFlight cf = o; // Assigns the value of o into cf.

    if (o instanceof CargoFlight) {
        CargoFlight cf = (CargoFlight) o;
        cf.add1Package(1.0, 2.5, 3.0)
    }
    ```
  * **`instanceof`** checks what type of instance the Reference variable points to.
  * Use "Casting", `(CargoFlight) o`, to cast what type of reference `o` points to.
  * Object class itself has many built in methods.
  * These are the frequently use methods:

    clone
    : Creates a new object instance that duplicates the current instance. 

    hashcode
    : Get a hash code for the current instance.

    getClass
    : Return type information for the current instance.

    finalize
    : Handle special resource cleanup scenarios.

    toString
    : Return string of characters representing the current instance.

    equals
    : Compares one instance to another.


### Object equality:
```Java
Flight f1 = new Flight(175);
```


### Super keyword:

### Final and abstract:

### Inheritance and constructors: