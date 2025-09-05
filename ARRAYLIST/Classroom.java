import java.util.ArrayList;

public class Classroom {


public static void main(String args[]){

    ArrayList<Integer>List1= new ArrayList<>();
    ArrayList<String>List2= new ArrayList<>(); 
    ArrayList<Boolean>List3= new ArrayList<>();

     

    List1.add(1);   //0(1)
    List1.add(3);
    List1.add(4);
    List1.add(6);
System.out.println(List1);


//get operation 
int element =List1.get(2);
System.out.println(element);

//remive/delete
List1.remove(3);
System.out.println(List1);


List1.set(2,19);
System.out.println(List1);


System.out.println(List1.contains(3));
System.out.println(List1.contains(33));

List1.add(1,8);//linar time add operation
System.out.println(List1);


//size of al
System.out.println(List1.size());



///print aaray 

for(int i=0;i<List1.size();i++){
    System.out.println(List1.get(i));
}
System.out.print(List1);

System.out.println();

//reverse array 

for(int i=List1.size()-1;i>=0;i--){
    System.out.print(List1.get(i)+" ");
}
System.out.println();
    }
    
}
