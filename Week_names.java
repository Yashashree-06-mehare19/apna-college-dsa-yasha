import java.util.Scanner;

public class Week_names {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int week_number=sc.nextInt();

        switch(week_number){

            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4:System.out.println("thursday");
            break;
            case 5: System.out.println("friday");
            break;
            case 6: System.out.println("saturday");
            break;
            case 7: System.out.println("sunday");
            break;
            default :System.out.println("Invalid week number");
        }



        sc.close();
    }
    
}
