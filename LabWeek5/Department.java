public class Department{
       private String depName;
       private String depIncharge;
       private int numofLab;
       private Lab[] labs;
       
       public Department(String depName, String depIncharge, Lab[] labs) {
        this.depName = depName;
        this.depIncharge = depIncharge;
        setLabs(labs); 
    }
       public void setdepname(String depName){
             this.depName=depName;
}
       public String getdepname(){
             return depName;
}
       public void setdepIncharge(String depIncharge){
             this.depIncharge=depIncharge;
}
       public String getdepIncharge(){
             return depIncharge;
}
       public void setNolab(int numofLab){
             this.numofLab=numofLab;
}
       public int getNolab(){
             return numofLab;
}
       public void setLabs(Lab[] labs){
             this.labs=labs;
             this.numofLab=labs.length;
}
       public Lab[] getLabs(){
             return labs;
}
     public void displayDepartment(){
        System.out.println("Department: " + depName);
        System.out.println("Incharge: " + depIncharge);
        System.out.println("Number of Labs: " + numofLab);
        for (Lab lab : labs) {
            lab.displayLab();
  }
 }
}