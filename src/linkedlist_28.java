import java.util.Scanner;

public class linkedlist_28 {
    // we use generic concept to provide type safety and to resolve type casting problem we use generic.
    //structure of node

static class Node{
    int data;
    Node next; // type of address is same as class i.e for ex- Node
    // creating constructor
    Node(int data){
        this.data=data;
        this.next=null;

    }
    }
    Node head=null;

    //we create 2 functions
    //1- for creation
    //2- for display or traversing ke liye

    public void creation()
    {
    int data ,n;
    // want to add more data we use do loop
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter data");
            data = s.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                // agar head ki value null h to hum head me new node ka address assign kr denge
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("do u want to add more data if YES, press:1 ");
            n = s.nextInt();
        }
        while(n==1); // n==1 for pressing 1 for continue

    }
    public void display()
    {
        // we create a pointer i.e. temp
        Node temp = head;
    if (head==null)
    {
        System.out.println("Linklist not exist");

    }
    // if linklist exist
        else {
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
    }
    }
// main method.
    public static void main(String[] args) {
        // object creation for class
        linkedlist_28 Linklist = new linkedlist_28();
        Linklist.creation();
        Linklist.display();
    }





    

}
