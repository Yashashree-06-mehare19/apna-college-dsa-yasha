import java.util.*;

public class ArrayCC {

public static void update(int marks[]){

for(int i=0;i<marks.length;i++){

    marks[i]=marks[i]+1;

}

}




    public static void main(String[] args) {
//         // int marks[]=new int[50];
//         // int numbers[]={1,2,3};
//         // String fruits[]={"apple", "banana","guavav"};  
//         int marks[]=new int[100];

       
// System.out.println("length of array "+ marks.length);
//         // marks[0]=sc.nextInt();
//         // marks[1]=sc.nextInt();
//         // marks[2]=sc.nextInt();


//         // System.out.println("phy :"+ marks[0]);
//         // System.out.println("chem :"+ marks[1]);
//         // System.out.println("math :"+ marks[2]);




Scanner sc=new Scanner(System.in);       
int marks[]={68,50,90};
update(marks);

for(int i=0;i<=marks.length;i++){

    System.out.println(marks[i]+ " ");
}

System.out.println();
        sc.close();
    }
}
