public class Demo{
       public static void main(String []args){
          PC[] pc1={new PC(1,8,512,"i5")};
          PC[] pc2={new PC(2,16,1024,"i7")};

          Lab[] lb1={new Lab("Software Lab","Mr Rehman",10,pc1)};       
          Lab[] lb2={new Lab("Engineering Lab","Mr Khan",20,pc2)};

          Department[] departments={new Department("Computer Science","Mr Ali",lb1),
                           new Department("Electrical Engineering", "Dr. John", lb2)
};

          Campus campus=new Campus("Lahore Campus","Mr Bhatti","LDA Avenue",departments);
          campus.displayCampus();
}

}