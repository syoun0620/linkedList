// Sukwhan Youn

public class LinkedListTest {
  
  public static void main(String[] args) {
    int[] Array1 = {1,3,5,7,9};
    int[] Array2 = {2,4,6,8,9};
    
    LinkedList testLL1 = new LinkedList(Array1);
    LinkedList testLL2 = new LinkedList(Array2);
    
    System.out.println("testLL1 is: " + testLL1.displayLinkedList());
    System.out.println("testLL2 is: " + testLL2.displayLinkedList());
    
    testLL1.append(testLL2);
    System.out.println("Appending testLL2 to testLL1 is: " + testLL1.displayLinkedList());

    
    LinkedList testLL3 = new LinkedList(Array1);
    LinkedList testLL4 = new LinkedList(Array2);
    
    System.out.println("testLL3 is: " + testLL3.displayLinkedList());
    System.out.println("testLL4 is: " + testLL4.displayLinkedList());
    
    testLL3.interleave(testLL4);
    
    System.out.println("testLL3 interleaved with testLL_4 is: " + testLL3.displayLinkedList());
  }
}