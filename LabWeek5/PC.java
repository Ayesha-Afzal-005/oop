public class PC{
       private int pcID;
       private int ram;
       private int disk;
       private String core; 

       public PC(int pcID,int ram,int disk,String core){
             this.pcID=pcID;
             this.ram=ram;
             this.disk=disk;
             this.core=core; 
}        
       public void setPcId(int pcID){
             this.pcID=pcID;
}
       public int getPcId(){
             return pcID;
}
       public void setRam(int ram){
             this.ram=ram;
}
       public int getRam(){
             return ram;
}  
       public void setDisk(int disk){
             this.disk=disk;
}							
       public int getDisk(){
             return disk;
}   
       public void setCore(String core){
             this.core=core;
}							
       public String getCore(){
             return core;
}   
public void displayPc(){
         System.out.println("PC ID:"+pcID);
         System.out.println("RAM:"+ram+"GB");
         System.out.println("Disk:"+disk+"GB");
         System.out.println("Core:"+core);
}


}