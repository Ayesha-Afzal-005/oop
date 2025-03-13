public class Campus{
       private String campusName;
       private String director;
       private String address;
       private Department[] dpt;

       public Campus(String campusName, String director,String address,Department[]dpt){
               this.campusName=campusName;
               this.director=director;
               this.address=address;
               setDepart(dpt);
}
       public void setCname(String campusName){
            this.campusName=campusName;
}
       public String getCname(){
            return campusName;
}
       public void setDirector(String director){
            this.director=director;
}
       public String getDirector(){
            return director;
}
       public void setAddress(String address){
            this.address=address;
}
       public String getaddress(){
            return address;
}
       public void setDepart(Department[] dpt){
            this.dpt=dpt;
}
       public Department[] getDepart(){
            return dpt;
}
       public void displayCampus(){
            System.out.println("Campus Name:"+campusName);
            System.out.println("Director:"+director);
            System.out.println("Address:"+address);
               for(Department dp:dpt){
                    dp.displayDepartment();
  }
 }
}