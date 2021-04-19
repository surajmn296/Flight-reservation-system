public class TouristTicket extends Ticket {
//    For tourist tickets, we should be able to keep track of the hotel address
//    and the selected tourist locations by the passenger. A passenger can
//    select a maximum of five tourist locations. We should also be able to add
//    or remove tourist locations if required.

    String HotelAddress;
    String tourist_locations;
    Flight flight;

    public TouristTicket(String PNR_number, String departure, String destination, String seatNumber, float price, float duration, Flight flight, String hotelAddress, String tourist_locations, Flight flight1) {
        super(PNR_number, departure, destination, seatNumber, price, duration, flight);
        HotelAddress = hotelAddress;
        this.tourist_locations = tourist_locations;
        this.flight = flight1;
    }
}
