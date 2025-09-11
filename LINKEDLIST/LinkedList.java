public class LinkedList {

public static class Node{

    int data;
    Node next;


    public Node(int data){
        this.data=data;
        this.next=null;

    }
}    
public static Node head;
public static Node tail;

public void addfirst(int data){

//step 1- create new node
Node newNode=new Node(data);

if(head==null){
        head=tail=newNode;
        return;
}    
//step 2 newnode=head of prev
newNode.next=head;//link

//step 3 head= newnode
head=newNode;


}


public void addLast(int data){
    Node newNode=new Node(data);

    if(head==null){ //or tail==null
        tail=head=newNode;
        return;
    }
    tail.next=newNode;

    tail=newNode;

}

public void print(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"-> ");
        temp=temp.next; 
    }
    System.out.println("null");
}

public static void main(String[] args) {
      
   LinkedList ll=new LinkedList();
   ll.print();
   ll.addfirst(1);
   ll.print();
   ll.addfirst(2);
   ll.print();
   ll.addLast(3);
   ll.print();
   ll.addLast(4);
   ll.print();



  
    }
    
}
