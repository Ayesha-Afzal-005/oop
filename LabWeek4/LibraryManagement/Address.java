public class Address{
       private String street;
       private String city;

      Address(String street,String city){
            this.street=street;
            this.city=city;
}

      Address(Address other){
            this.street=other.street;
            this.city=other.city;
}
      void showAddress(){
            System.out.println("Street : "+street);
            System.out.println("City: "+city);
}
}