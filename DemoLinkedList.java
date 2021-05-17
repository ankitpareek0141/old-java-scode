import java.util.Scanner;

class Node{
    int data;
    Node next;
    static Node start = null;

    public void insertLast(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Data in Node : ");
        Node node = new Node();
        node.data = input.nextInt();
        node.next = null;
        if(Node.start==null)
            Node.start = node;
        else{
            Node temp = Node.start;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next=node;
        }
    }

    public void display(){
        Node temp = Node.start;
        while(temp!=null){
            System.out.println("--->"+temp.data);
            temp =temp.next;
        }
    }
    public static void main(String[] args){
        Node node = new Node();
            node.insertLast();
            node.insertLast();
            node.insertLast();
            node.insertLast();
            node.insertLast();
            node.display();
    }
}