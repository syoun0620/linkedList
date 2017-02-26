//Sukwhan Youn

import java.util.Arrays;

public class LinkedList{
  
  Node first;
  
  private class Node {
    int item;
    Node next;
  }
  
  public LinkedList(int[] a) {
    
    int[] temp = new int[a.length];
    temp = a;
    
    Arrays.sort(temp);
    
    first = buildLinkedList(temp);
  }
  
  public Node buildLinkedList(int[] a) {
    
    Node first = new Node();
    first.item = a[0];
    Node theNode = first;

    for(int i = 1; i < a.length; i++) {
      Node oneNode = new Node();
      oneNode.item = a[i];
      theNode.next = oneNode;
      theNode = theNode.next;
    }
    
    return first; 
  }
  
  public void append(LinkedList other) {
    
    Node traverse = this.first;

    while(traverse.next != null) {
      traverse = traverse.next;
    }
    
    Node otherfirst = new Node();
    otherfirst.item = other.first.item;
    Node theNode = otherfirst;
    
    for(Node traverse_1 = other.first; traverse_1 != null; traverse_1 = traverse_1.next) {
      Node oneNode = new Node();
      oneNode.item = traverse_1.item;
      theNode.next = oneNode;
      theNode = theNode.next;
    }
    
    if(traverse.next == null) {
      traverse.next = otherfirst;
    }
  }
  
  public void interleave(LinkedList other) {

    Node thisNode = this.first;
    
    Node otherNode = other.first;
    
    Node interleaveNode = new Node();
    
    if(thisNode.item <= otherNode.item) {
      interleaveNode.item = thisNode.item;
      thisNode = thisNode.next;
    } else {
      interleaveNode.item = otherNode.item;
      otherNode = otherNode.next;
    }
    
    Node placeholderNode = new Node();
    
    placeholderNode = interleaveNode;
    
    while(thisNode != null && otherNode != null) {
      if(thisNode.item <= otherNode.item) {
        Node compareNode = new Node();
        compareNode.item = thisNode.item;
        placeholderNode.next = compareNode;
        placeholderNode = placeholderNode.next;
        thisNode = thisNode.next;
      } else {
        Node compareNode = new Node();
        compareNode.item = otherNode.item;
        placeholderNode.next = compareNode;
        placeholderNode = placeholderNode.next;
        otherNode = otherNode.next;
      }
    }

    if(thisNode == null) {
      placeholderNode.next = otherNode;
    } else {
      placeholderNode.next = thisNode;
    }
    
    this.first = interleaveNode;
  }
  
  public String displayLinkedList() {
    
    String finalString = "";
    
    for(Node traverse = this.first; traverse != null; traverse = traverse.next) {
      finalString += traverse.item + " ";
    }
    
    return finalString; 
  }
}