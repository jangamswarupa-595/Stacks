import java.util.Enumeration;
import java.util.Stack;

public class Enumerations{
    String name;
        int age;
       
    
      public Enumerations(String name,int age){
      this.name=name;
      this.age=age;
      
      }
  public static void main(String[]args){
   // Create an Object for Stack
   Stack<Enumerations> s3=new Stack<>();
  
  // Load person class Objects in it
  s3.push(new Enumerations("Swarupa",21));
  s3.push(new Enumerations("Chinnu",22));

  // Iterate it by using Enumeration
  Enumeration<Enumerations> e=s3.elements();

  // print the values by using while Loop
  while(e.hasMoreElements()){
    Enumerations p=e.nextElement();
    System.out.println("Name: "+p.name+","+"Age: "+p.age);


  }}
}
