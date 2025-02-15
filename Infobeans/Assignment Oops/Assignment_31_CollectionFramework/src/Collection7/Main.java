package Collection7;
//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.TreeSet; 
class Main {
 public static void main(String[] args) {    // Declare a treeset 
     TreeSet<Object> data = new TreeSet<Object>(); 
     data.add(2); 
     data.add(20); 
     data.add(10); 
     data.add(5); 
     data.add(7); 
     data.add(3); 

     // Initialize treeset with predefined set in reverse order 
     // using descendingSet() 
     TreeSet<Object> dataReverse = (TreeSet<Object>)data.descendingSet(); 

     // Print the set 
     System.out.println("Without descendingSet(): " + data); 
     System.out.println("With descendingSet(): " + dataReverse); 
 } 
}