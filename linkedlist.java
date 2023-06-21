package linkedlist;

import java.util.LinkedList;

public class linkedlist {

  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    
    // Use addFirst() to add the item to the beginning
  cars.addFirst("Mazda"); //System.out.println(cars);
    
  // cars.addLast("Maruti"); //System.out.println(cars);
    
  // cars.removeFirst();//System.out.println(cars);
    
 //cars.removeLast(); // System.out.println(cars);
    
  // cars.getFirst();  //System.out.println(cars.getFirst());
    
    //cars.getLast();  System.out.println(cars.getLast());
    
    
    System.out.println(cars);
  }
}
