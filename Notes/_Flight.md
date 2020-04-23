### This is the compilation of Flight class examples:

```Java
public class Flight {

	private int passengers;
	private int seats = 150;
		
	// Getter method.
	public int getSeats() {
		return seats;
	}
	// Setter method.
	public void setSeats(int seats) {
		this.seats = seats;
	}

    public void add1Passenger(){
        if (hasSeating()) 
            passengers += 1;
        else
            handleTooMany();
    }

    private boolean hasSeating() {
        return passenger < seats;
    }

    // CONSTRUCTORS:
    public Flight() {}
	
    public Flight(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	
    public Flight(char flightClass) {
		this.flightClass = flightClass;
	}
}


```