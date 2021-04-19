public class main {
    public static void main(String[] args) {
        Flight flight = new Flight("1","2",3,4);
        String[] x = {"peanuts", "almonds"};
        RegularTicket regularTicket = new RegularTicket("12","12:00","gujarat","12",3500.90f,6.0f ,flight , x );
    TouristTicket touristTicket = new TouristTicket("13","12:00","gujarat","12",3500.90f,6.0f ,flight , "x","y" );
printTicketDetails(regularTicket);
printTicketDetails(touristTicket);
    }
    public static void printTicketDetails(Ticket ticket){
        String TicketDetails = ticket.getPNR_number();
        System.out.println(TicketDetails);

    }
}
