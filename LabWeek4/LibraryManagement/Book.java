public class Book{
       private String title;
       private String edition;
       private Date publicationDate;
       private Person author;

       Book(String title,String edition,Date publication,Person author){
           this.title=title;
           this.edition=edition;
           this.publicationDate=publicationDate;   
           this.author=author;    
}
       Book(Book other){
           this.title=other.title;
           this.edition=other.edition;
           this.publicationDate=other.publicationDate;   
           this.author=other.author;    
}
       void Display(){
          System.out.println("Title: "+title);
          System.out.println("Edition: "+ edition);
          System.out.println("Publication Date : "+ publicationDate.showDate());
          System.out.println("Author : "+ author.showPerson());
} 
      
}