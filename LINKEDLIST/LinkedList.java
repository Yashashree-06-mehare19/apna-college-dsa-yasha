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
public static int size;

public static void addfirst(int data){

//step 1- create new node
Node newNode=new Node(data);
size++;
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
    size++;
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


public static void add(int idx, int data){

    if(idx==0){
        addfirst(data);
        return;
    }
    Node newNode=new Node(data);
    size++;
    Node temp=head;

    int i=0;
    while(i<idx-1){
        temp=temp.next;
        i++;
    }
    //i=idx-1; tem-> prev

    newNode.next=temp.next;
    temp.next=newNode;
     
}

public int removefirst(){
    if(size==0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
    }else if(size==1){
       int value=head.data; 
       head=tail=null;
       size=0;
       return value;
    }
    
    int value=head.data;
    head=head.next;
    size--;
    return value;

}

public int removelast(){
    if(size==0){
        System.out.println("ll is empty ");
    }else  if(size==1){
        int value=head.data;
        head=tail=null;
        size=0;
        return value;
    }

    //prev : i=size-2;
    Node prev=head;
    for(int i=0;i<size-2;i++){
        prev=prev.next;
    }
   int  value=prev.next.data;//tail data
    prev.next=null;
    tail=prev;
    size--;
    return value;
}

public int itr_search(int key){
Node temp=head;
int i=0;
while(temp!=null){
    if(temp.data==key){//key found 
        return i;
    }

    temp=temp.next;
    i++;
} 
return -1;    //not found, we reached null
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
   
   ll.add(2, 90);
   ll.print();
   

   ll.removefirst();
ll.print();
ll.removelast();
ll.print();


   System.out.println(ll.itr_search(3)); 
  System.out.println(ll.itr_search(10));
    }
    
}
