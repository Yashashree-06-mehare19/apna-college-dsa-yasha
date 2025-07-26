import java.util.Scanner;

public class largest_of_three_nums {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.println("enter A ,B ,C ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c) System.out.println("A IS GREATEST");
        else if(b>=c) System.out.println("B IS GREATEST");
        else System.out.println("C IS GREATEST");


        sc.close();


    }
}
