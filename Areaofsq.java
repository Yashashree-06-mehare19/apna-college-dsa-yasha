import java.util.Scanner;

public class Areaofsq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of 1 side of the sq :");

        int side=sc.nextInt();
        int area=side*side;

        System.out.println("area of square is "+area);

        sc.close();
    }
}
