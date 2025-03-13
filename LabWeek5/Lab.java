public class Lab{
       private String labName;
       private String staffName;
       private int numofPc;
       private PC[] pcs;
  
       public Lab(String labName, String staffName, int numofPc, PC[] pcs) {
        this.labName = labName;
        this.staffName = staffName;
        this.numofPc = numofPc;
        setPcs(pcs); 
    }     
       public void setLname(String labName){
             this.labName=labName;
}
       public String getLname(){
             return labName;
}
       public void setSname(String staffName){
             this.staffName=staffName;
}
       public String getSname(){
             return staffName;
}
       public void setPc(int numofPc){
             this.numofPc=numofPc;
}
       public int getPc(){
             return numofPc;
}
       public void setPcs(PC[] pcs){
             this.pcs=pcs;
}
       public PC[] getPcs(){
             return pcs;
}
      public void displayLab(){
         System.out.println("Lab name:"+labName);
         System.out.println("Staff name:"+staffName);
         System.out.println("Number of PCs:"+numofPc);
      for(PC pc : pcs){
         pc.displayPc();
}
}
}