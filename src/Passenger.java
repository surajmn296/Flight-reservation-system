public class Passenger {
   private static int idCounter=0 ;
             Contact contact ;
             Address address ;
   



   private static class Address {
       String street;
       String city;
       String state;

       public Address(String street, String city, String state) {
           this.street = street;
           this.city = city;
           this.state = state;
       }

       public void updateAddressDetails(String street, String city, String state) {
           this.street = street;
           this.city = city;
           this.state = state;
       }

       public String getAddressDetails() {
           return street + "\n" + city + "\n" + state;
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
         public void updateContactDetails(String name, String phoneNumber, String emailID){
             this.name = name;
             this.phoneNumber = phoneNumber;
             this.emailID = emailID;
           }
        public String getContactDetails() {
            return name+"\n"+phoneNumber+"\n"+emailID; }
    }

   public Passenger(String street, String city, String state ,String name, String phoneNumber, String emailID) {
    Passenger.Contact contact = new Contact(name,phoneNumber,emailID);
      Passenger.Address address= new Address(street,city,state);
          this.contact =contact;
          this.address = address;
      ++idCounter;
   }

       public int getPassengerCount(){
      return idCounter;
      }
         public String getContact()
         {
           String contactDetails =contact.getContactDetails() ;
                     return contactDetails;}
         public String getAddress(){
               String addressDetails =address.getAddressDetails() ;
                         return addressDetails;
         }


  }
