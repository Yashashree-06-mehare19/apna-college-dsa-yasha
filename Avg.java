import java.util.Scanner;


public class Avg {
    
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int a =sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();

    // System.out.println(a);
    // System.out.println(b);
    // System.out.println(c);

    int avg=(a+b+c)/3;

    System.out.println("average is "+avg);
    sc.close();
}

}

    

