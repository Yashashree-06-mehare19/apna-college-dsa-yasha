public class oops3 {
    public static void main(String[] args) {
        
      Horse h=new Horse();
        h.eat();
        h.walk();

        Chicken c=new Chicken();
        c.eat();
        c.walk();

        System.out.println(h.color);
    }
    
}

abstract class Animal{

String color;

    Animal(){
        color="brown";
    }

void eat(){//non abstract mehod
 System.out.println("animal eats");
}

abstract void walk();//abstarct method; we did not give any implemaentation 

}
class Horse extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }

    void changecolor(){
        color="dark brown";
    }
}

class Chicken extends Animal{
    void walk(){

        System.out.println("walks on 2 legs");
    }

    void changecolor(){
        color="yellow";
    }
}




