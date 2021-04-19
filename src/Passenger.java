public class Passenger {
   private static int idCounter=0 ;

   private static class Address {
      String  street ;
      String city ;
      String    state;

      public Address(String street, String city, String state) {
         this.street = street;
         this.city = city;
         this.state = state;
      }
   }
    private static class Contact {
      String name ;
      String phoneNumber ;
      String emailID;
       Contact(String name, String phoneNumber, String emailID) {
         this.name = name;
         this.phoneNumber = phoneNumber;
         this.emailID = emailID; }
   }

   public Passenger(String street, String city, String state ,String name, String phoneNumber, String emailID) {
    Passenger.Contact contact = new Contact(name,phoneNumber,emailID);
      Passenger.Address address= new Address(street,city,state);
      ++idCounter; }
       public int getPassengerCount(){
      return idCounter;
      }

}
