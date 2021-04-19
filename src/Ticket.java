public class Ticket {
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
    Flight flight;

    public Ticket(Flight flight) {
        this.flight = flight;
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
}
