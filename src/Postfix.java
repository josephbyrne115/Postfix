//Author: Joseph Byrne

import SLL.Node;
import SLL.SLLStack;
import SLL.Stack;

import java.io.*;
import java.util.Scanner;

public class Postfix {
    public static void main(String[] args) throws IOException {

        Stack stack = new SLLStack();

        Scanner fin = new Scanner(new File("data.txt")); //data.txt

        while(fin.hasNext()) {
            Node v = new Node(fin.nextLine());

            switch(v.getData()) {
                case "+" :  stack.sum();
                            break;
                case "-" :  stack.difference();
                            break;
                case "*" :  stack.multiply();
                            break;
                case "/" :  stack.divide();
                            break;
                default :   stack.push(v);
                            break;
            }

        }

        System.out.println(stack);

    }//end main


}//end Postfix class
