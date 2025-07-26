public class sum {
    public static void main(String[] args) {
        byte b='4';
        char c='a';
        short s=512;
        int i=1000;
        float f=3.14f;
        double d=99.9954;
        // int $=24;//allowed
        // int &=23;//not allowed

     double result=(f*b)+(i%c)-(d*s);
     System.out.println(result);
     //System.out.println($);

    }
    
}
