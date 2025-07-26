import java.util.Scanner;

public class string {

    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
        }
    

public static void main(String[] args) {
    

    // char arr[]={'a','b','c','d'};
    // String str="abcd";
    // String str2=new String("hfhh");


    //strings are immutable

Scanner sc= new Scanner(System.in);
System.out.println("give ur name:");
String name=sc.next();
System.out.println(name);

sc.nextLine();

System.out.println("give  2nd ur name:");
String name2=sc.nextLine();
System.out.println(name2);
System.out.println(name2.length());

//concatenation 
String firstname="vaishali";
String lastname="mehare";
String fullname=firstname+" "+ lastname;
System.out.println(fullname.charAt(6));

System.out.println(fullname);


printletters(fullname);
sc.close();
}

    
}
