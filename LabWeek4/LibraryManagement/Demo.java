public class Demo{

       public static void main(String []args){
             Date pubDate=new Date(15,6,2020);
             Person pubPerson=new Person("Äyesha",);
             Book b1=new Book("Programming","1971Ad",pubDate,pubPerson);
             Book b2=new Book(b1);
       b1.Display();
       b2.Display();
}
}