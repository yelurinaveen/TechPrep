package com.adiye.techprep.datastructures;

/**
 * Created by nyeluri on 1/22/17.
 */
public class LinkedList<T> {

    Node<T> node;
    Node<T> head;

    class Node<T>{
        T t;
        Node next;

        public Node(T t){
            this.t = t;
        }
    }

    public void add(T t){
        if(this.head!=null){
            Node nextNode = new Node<T>(t);
            this.head.next = nextNode;
            this.head = nextNode;
        }
        //First Element insertion
        else{
            this.node = new Node<T>(t);
            this.head = node;
        }
    }

    public T get(int index){
        Node<T> returnNode = null;
        while(index>=0){
            if(returnNode!=null){
                returnNode = returnNode.next;
            }
            else{
                returnNode = this.node;
            }
            index--;
        }
        return returnNode.t;
    }

    //Other methods to be implemented
    public void add(T t, int index){
        
    }

}
