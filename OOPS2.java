public class OOPS2 {

    public static void main(String[] args) {
        Calculator calc=new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)2.5,(float)3.4));
        System.out.println(calc.sum(1,2,3));

        Deer d=new Deer();
        d.eat();
    } 
}

class Animal{

    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal{
    void eat(){

        System.out.println("eats grass");
    }
}

    class Calculator{
        int sum(int a,int b){
            return a+b;
        }

        float sum(float a,float b){
            return a+b;
        }

        int sum(int a , int b , int c){
            return a+b+c;
        }
    }
    

