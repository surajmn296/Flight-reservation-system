public class Flight {
// For flights, we should be able to keep track of the flight number, the airline
//    of the flight, the capacity of that flight and the number of seats booked.
//    We should be able to get the flight details and check the availability of
//    seats. Whenever a seat is booked on a flight, the number of seats booked
//    should be updated for that flight.
    private String flightNumber ;
    private String airline ;
    private int capacity ;
    private int BookedSeats ;

    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        BookedSeats = bookedSeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return BookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        BookedSeats = bookedSeats;
    }

    public void getFlightDetails(){
        System.out.println(getFlightNumber());
        System.out.println(getAirline());
        System.out.println(getBookedSeats());
        System.out.println(getCapacity());
    }
        public void incrementBookingCounter(){
        ++BookedSeats;
    }
}
