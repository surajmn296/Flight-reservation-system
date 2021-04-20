import java.util.Arrays;
public class TouristTicket extends Ticket {
//    For tourist tickets, we should be able to keep track of the hotel address
//    and the selected tourist locations by the passenger. A passenger can
//    select a maximum of five tourist locations. We should also be able to add
//    or remove tourist locations if required.

    private String HotelAddress;
   private  String[] tourist_locations = new String[5];
   private int i=0 ;

    public TouristTicket(String PNR_number, String departure, String destination, String seatNumber, float price, float duration, Flight flight, String departureDatetime, String arrivalDatetime, boolean cancelled, Passenger passenger, String hotelAddress, String[] tourist_locations, int i) {
        super(PNR_number, departure, destination, seatNumber, price, duration, flight, departureDatetime, arrivalDatetime, cancelled, passenger);
        HotelAddress = hotelAddress;
        this.tourist_locations = tourist_locations;
        this.i = i;
    }

    public String getHotelAddress() {
        return HotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        HotelAddress = hotelAddress;
    }

    public String[] getTourist_locations() {
        return tourist_locations;
    }

    public void setTourist_locations(String[] tourist_locations) {
        this.tourist_locations = tourist_locations;
    }
    public void AddTouristLocation(String touristLocation){
        try{
            tourist_locations [i] = "tourist_locations";
            i++;
        } catch (Exception e){
            System.out.println("location limit exceeded");
        }
    }
    public void DeleteTouristLocation(String TouristLocation){
        boolean count = false;
        int i ;
        for(i=0; i < tourist_locations.length; i++)
        {
            if(tourist_locations[i].equals(TouristLocation))
            {
                count = true;
                break;
            }
        }
        if(count)
        { tourist_locations[i] = null;
            //do some other thing
        }
        else
        {
            System.out.println("location not found");
        }


    }
}
