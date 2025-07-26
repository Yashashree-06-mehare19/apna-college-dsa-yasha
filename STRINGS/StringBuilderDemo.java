public class StringBuilderDemo {


    public static void main(String[] args) {
        
         StringBuilder sb= new StringBuilder("");
         for(char ch='a';ch<='z';ch++){
            sb.append(ch);
         }
//o(26)
         System.out.print(sb+" ");
    }
    
}
