import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter year :");
        int year=sc.nextInt();

    //     if(year%4==0){
    //         if(year%100==0){
    //             if(year%400==0){
    //                 System.out.println(year+" is leap year");
                    
    //             }
    //             else{ System.out.println(year+" is not a leap year");
    //         }
    //     }

    // }

if(year%4!=0){
    System.out.println(year+" is not a leap year");
}
else if(year%100!=0){
    System.out.println(year+ " leap year");
}
else if(year%400!=0){
    System.out.println(year+" is not a leap year");
    
}
else{System.out.println(year+"is a leap year ");
}
sc.close();
    }}

