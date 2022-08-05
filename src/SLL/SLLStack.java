//Author: Joseph Byrne

package SLL;

public class SLLStack implements Stack{

    protected Node top;
    protected int size;

    public SLLStack() {
        top = null;
        size = 0;
    }//end constructor

    public int size(){
        return this.size;
    }

    public String top(){
        return this.top.getData();
    }


    @Override
    public String pop() {
        if(size == 0) return "Stack is empty";

        if(size == 1) {
            Node d = top;
            top = null;
            size--;
            return d.getData();
        }

        else {
            Node d = top;
            top = top.getNext();
            d.setNext(null);
            size--;
            return d.getData();
        }

    }

    @Override
    public void push(Node v) {
        if(v == null)
            throw new IllegalArgumentException("Bad params - incoming node is null");

        if(size == 0) {
            top = v;
            v.setNext(null);
            size++;
        }

        else if(size >= 1) {
            //SWITCH TOP
            v.setNext(top);
            top = v;
            size++;
        }
    }//end push

    public double sum(){
        double x = Double.parseDouble(pop());
        double y = Double.parseDouble(pop());
        double sum = y + x;

        Node v = new Node(String.valueOf(sum));
        push(v);
        return sum;
    }//end sum

    public double difference() {
        double x = Double.parseDouble(pop());
        double y = Double.parseDouble(pop());
        double diff = y - x;

        Node v = new Node(String.valueOf(diff));
        push(v);

        return diff;
    }//end difference

    public double multiply() {
        double x = Double.parseDouble(pop());
        double y = Double.parseDouble(pop());
        double prod = y * x;

        Node v = new Node(String.valueOf(prod));
        push(v);

        return prod;
    }//end multiply

    public double divide() {
        double x = Double.parseDouble(pop());
        double y = Double.parseDouble(pop());
        double quot = y / x;

        Node v = new Node(String.valueOf(quot));
        push(v);

        return quot;
    }//end difference

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Node cur = top; cur != null; cur = cur.getNext())
            sb.append("(" + cur.getData() + ")" + "-> ");
        return sb.toString();
    }//end toString


}//end SLinkedList class
