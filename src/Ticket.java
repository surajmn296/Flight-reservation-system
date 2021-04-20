public abstract class Ticket {
   /* For each ticket, we should be able to keep track
    of the PNR number, departure and destination locations, the flight on
    which the seat is booked, the date and time of departure and arrival, the
    details of the passenger who booked the ticket, the seat number, the price
    of the ticket and whether that ticket is cancelled or not. For each ticket, we
    should be able to check its status (either ‘Confirmed’ or ‘Cancelled’), the
    duration of the journey, and we should also be able to cancel the ticket.*/

    private String PNR_number;
    private String departure;
    private String destination;
    private String seatNumber;
    private float price;
    private float duration;
    private Flight flight;
    private String DepartureDatetime ;
    private String ArrivalDatetime ;
    private boolean Cancelled;
    private Passenger passenger;


    public Ticket(String PNR_number, String departure, String destination, String seatNumber, float price, float duration, Flight flight, String departureDatetime, String arrivalDatetime, boolean cancelled, Passenger passenger) {
        this.PNR_number = PNR_number;
        this.departure = departure;
        this.destination = destination;
        this.seatNumber = seatNumber;
        this.price = price;
        this.duration = duration;
        this.flight = flight;
        DepartureDatetime = departureDatetime;
        ArrivalDatetime = arrivalDatetime;
        Cancelled = cancelled;
        this.passenger = passenger;
    }

    public String getDepartureDatetime() {
        return DepartureDatetime;
    }

    public void setDepartureDatetime(String departureDatetime) {
        DepartureDatetime = departureDatetime;
    }

    public String getArrivalDatetime() {
        return ArrivalDatetime;
    }

    public void setArrivalDatetime(String arrivalDatetime) {
        ArrivalDatetime = arrivalDatetime;
    }

    public boolean isCancelled() {
        return Cancelled;
    }

    public void Cancel() {
        Cancelled = true;
    }
    public String checkStatus(){
        if(isCancelled()==false){return "confirmed";}
        else {return "cancelled";}
    }
    public String getPNR_number() {
        return PNR_number;
    }

    public void setPNR_number(String PNR_number) {
        this.PNR_number = PNR_number;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
