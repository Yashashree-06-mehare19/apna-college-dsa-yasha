public class Advance_patterns {


public static void inverted_rotated_triangle(int row){
//lines
    for(int i=1;i<=row;i++){
//spaces
        for(int j=1;j<=row-i;j++){

            System.out.print(" ");
        }
//stars
for(int j=1;j<=i;j++){

    System.out.print("*");
}    
System.out.println();        
        }

       
    }




    public static void hollow_rectangle(int rows, int cols){

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){

                if(i==1 || i==rows || j==1 || j==cols){

                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_withnumbers(int n){

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);

            }
            System.out.println();
        }
    }

public static void floyd(int n){

    int counter=1;
//no. of rows
    for(int i=1;i<=n;i++){
// no. cols to print 
for(int j=1; j<=i;j++){

    System.out.print(counter);
  
    counter++;
}   
System.out.println();

}

}
 

public static void zero_one_triangle(int n){

    for(int i=1;i<=n;i++){

        for(int j=1;j<=i;j++){

            if((i+j)%2==0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
        System.out.println();
    }
}


public static void butterfly(int n){
 
    //first half
    //stars
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){

            System.out.print("*");
        }
//spaces
        for(int j=1;j<=2*(n-i);j++){

            System.out.print(" ");
        }
//stars
        for(int j=1;j<=i;j++){

            System.out.print("*");
        } 
        System.out.println();

    }

     //2nd hald mirror

    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){

            System.out.print("*");
        }
//spaces
        for(int j=1;j<=2*(n-i);j++){

            System.out.print(" ");
        }
//stars
        for(int j=1;j<=i;j++){

            System.out.print("*");
        } 
        System.out.println();

    }

}

public static void solid_rhombus(int n){
    for(int i=1;i<=n;i++){

        //spaces
        for(int j=1;j<=(n-i);j++){

            System.out.print(" ");
        }

        //stars
        for(int j=1;j<=n;j++){

            System.out.print("*");
        }
        System.out.println();
    }
}

public static void hollow_rhombus(int n){

    for(int i=1;i<=n;i++){

        for(int j=1;j<=(n-i);j++){

            System.out.print(" ");
        }
        //hollow rectangle-stars
        for(int j=1;j<=n;j++){

if(i==1 || i==n || j==1 || j==n){

    System.out.print("*");
}else{

    System.out.print(" ");
}
        }
System.out.println();

    }


}

public static void diamond(int n){
//rows
    for(int i=1;i<=n;i++){
//spaces
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
//stars
    for(int j=1;j<=(i*2)-1;j++){
        System.out.print("*");
    }
    System.out.println();
       
    }
        
    

    for(int i=n-1;i>=1;i--){
        //spaces
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
//stars
    for(int j=1;j<=(i*2)-1;j++){
        System.out.print("*");
    }
    System.out.println();
  
}     
    }




public static void main(String[] args) {
hollow_rectangle(4, 5);
System.out.println();
inverted_rotated_triangle(7);
System.out.println();
inverted_half_pyramid_withnumbers(5);
System.out.println();   
floyd(5);
System.out.println();
zero_one_triangle(7);
System.out.println();
butterfly(4);
System.out.println();
solid_rhombus(5);
System.out.println();
hollow_rhombus(5);
System.out.println();
diamond(5);
}
    
}
