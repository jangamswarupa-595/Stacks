import java.util.ListIterator;
import java.util.Stack;

class Dynamic2{
  String name;
      int age;
     
  
    public Dynamic2(String name,int age){
    this.name=name;
    this.age=age;
    
    }
public static void main(String[]args){
// Create an Object for Stack
 Stack s2=new Stack<>();

  // Load person class Objects in it using push function
  s2.push(new Dynamic2("Swarupa",21));
  s2.push(new Dynamic2("Chinnu",22));
  // Iterate it by using List Iterator ListIterator<Dynamic1> iterator=p.listIterator();
  ListIterator<Dynamic2> iterator=s2.listIterator();

  // print the values by using while Loop
  while (iterator.hasNext()) {
    Dynamic2 p1 =iterator.next();


  

    System.out.println("Name: " +p1.name +","+"Age: "+ p1.age  );
}
}
}