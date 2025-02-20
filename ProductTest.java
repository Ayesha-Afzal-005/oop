public class ProductTest{
       private int procount=1;
       private String id;
       private String name;
       private int quantity;
       private double price;
       private String category;

       public ProductTest(String name1,int qty,double price1,String ctgy){
              name=name1;
              quantity=qty;
              price=price1;
              category=ctgy;
              id ="E"+String.format("%04d",procount++);
}
       public void display(){
              System.out.printf("ID : %s \n",id);
              System.out.printf("Name : %s \n",name);
              System.out.printf("Quantity : %d \n",quantity);
              System.out.printf("Price : %f \n",price);
              System.out.printf("Category : %s \n",category);
}
       public void setName(String newName){
             name=newName;
}
       public String getName(){
             return name;
}
       public void setQuantity(int newQuantity){
             quantity=newQuantity;
}
       public int getQuantity(){
             return quantity;
}

       public void setPrice(double newPrice){
           if(newPrice>0){
             price=newPrice;
}
           else{
             System.out.print("Price can't negative");
}
}
       public double getPrice(){
             return price;
}

       public void setCategory(String newCategory){
            category=newCategory;
}
       public String getCatgory(){
             return category;
}
}