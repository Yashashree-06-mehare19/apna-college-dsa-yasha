public class Oops {
    public static void main(String[] args) {
        

        Pen p1=new Pen();//created a pen object 
        p1.setcolor("blue");
        System.out.println(p1.getcolor());
        p1.settip(3);
        System.out.println(p1.gettip());
        p1.setcolor("Yellow");
        System.out.println(p1.getcolor());

        Bankaccount myacc=new Bankaccount();

        myacc.username="yashashree";
        //myacc.password="abcdefj";//will not be visible becoz password
       
     myacc.setpassword("absdf");//u can just change password here

    student s1=new student();
    s1.name="yamini";
    s1.roll=345;
    s1.password="sdf";
    // student s2=new student("yasha");
    // student s3=new student(123);
   // student s4=new student("aman",234);
student s2=new student(s1);
s2.password="dfg";


   
    }
}
class Pen {

    //prop

  private  String color;
  private  int tip;

    // void setcolor(String newColor){
    //     color=newColor;
    // }

    // void setTip(int newTip){
    //     tip=newTip;
    // }

String getcolor(){
    return this.color;

}

int gettip(){
    return this.tip;
}


void setcolor(String newcolor){
    this.color=newcolor;
}

void settip(int newtip){
    this.tip=newtip;
}

    }

    // class Student{

    //     String name;
    //     int age;
    //     float percentage;//cgp

    //     void calpercentage(int phy ,int chem,int math){

    //         percentage=(phy+chem+math)/3;
    //     }
    // }

    class Bankaccount{

                public String username;
                private String password;
                public void setpassword(String pwd){
                    password=pwd;
                }


    }

    class student{
        String name;
        int roll;
        String password;
        int marks[];
        student(){
            System.out.println("constructor is called");
        } 
        // //shallow copy constructors
        // student(student s1){
        //     this.name=s1.name;
        //     this.roll=s1.roll;

        // }

        //deep copy constructor

        student(student s1){
            marks=new int[3];
            this.name=s1.name;
            this.roll=s1.roll;
            for(int i=0;i<=marks.length;i++){
                this.marks[i]=s1.marks[i];
            }
        }


        student(String name){
            this.name=name;
            System.out.println("constructor name :"+ name);

        }

        student(int roll){
            this.roll=roll;
            System.out.println("constructor roll is "+roll);
        }
    }
