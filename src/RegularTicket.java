public class RegularTicket extends Ticket {
   /* For regular tickets, we should be able to keep track of what special
services the passengers have requested, such as food, water and snacks.
We should be able to check the special services availed by the passengers
and also update them if required*/


    private String[] SpecialServices;

    public RegularTicket(String PNR_number, String departure, String destination, String seatNumber, float price, float duration, Flight flight, String departureDatetime, String arrivalDatetime, boolean cancelled, Passenger passenger, String[] specialServices) {
        super(PNR_number, departure, destination, seatNumber, price, duration, flight, departureDatetime, arrivalDatetime, cancelled, passenger);
        SpecialServices = specialServices;
    }

    public String[] getSpecialServices() {
        return SpecialServices;
    }

    public void setSpecialServices(String[] specialServices) {
        SpecialServices = specialServices;
    }
    public void updateSpecialServices(String[] SpecialServices){
        this.SpecialServices=SpecialServices; }
}
