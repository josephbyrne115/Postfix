//Author: Joseph Byrne

package SLL;

public class Node {
    private String data;
    private Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }//end constructor

    public String getData() {return data;}
    public Node getNext() {return next;}
    //public void setData(String data) {this.data = data;}
    public void setNext(Node next){this.next = next;}

}//end Node class
