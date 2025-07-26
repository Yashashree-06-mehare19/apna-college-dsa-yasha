import java.util.Scanner;

public class check_multiple_of_ten {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        do{
            System.out.println("keep giving numbers :");
            int num=sc.nextInt();
            if(num%10==0){
                break;
            }
        }while(true);

        sc.close();
    }
}
