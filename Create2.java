import java.util.Iterator;
import java.util.Stack;

public class Create2{
public static void main(String[]args){
// Create an Object for Sta;ck
Stack s1=new Stack<>();

  // Load Values in Stack
  s1.push(4);
  s1.push(8);
  s1.push(12);

  // Iterate it by usig Iterator and While Loops
  Iterator i=s1.iterator();
  while(i.hasNext()){
    System.out.println(i.next());
  }
}
}
