import java.util.Scanner;

public class lowercasevovels {

    public static int count_vovels(String str){

        int count =0;

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){

                count++;
            }

        }

        System.out.println("Number of lowercase vowels: " + count);

        return count;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string :");

        String str=sc.nextLine();

        System.out.println(str);

    count_vovels(str);
sc.close();
    }
    
}
