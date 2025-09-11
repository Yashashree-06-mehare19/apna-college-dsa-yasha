import java.util.ArrayList;

public class PairSum {
//brute force approach    
public static boolean pairsum1(ArrayList<Integer>list,int target){

    for(int i=0;i<list.size();i++){
        for(int j=i+1;j<list.size();j++){
          if(list.get(i)+list.get(j)==target){
            return true;
          }  
        }
    }
    return false; 
}

public static boolean two_pointer_pair_sum1(ArrayList<Integer>list,int target){

    int lp=0;
    int rp=list.size()-1;

    while(lp!=rp){
        if(list.get(lp)+list.get(rp)==target){
            return true;
        }

        //case 2
        if(list.get(lp)+list.get(rp)<target){
            lp++;
        }else{
            rp--;
        }
    }

    return false;
}

public static boolean pair_sum_2(ArrayList<Integer>list2,int target2){
    int n=list2.size();
    int breaking_point=-1;

    for(int i=0;i<list2.size();i++){
        if(list2.get(i)>list2.get(i+1)){
      breaking_point=i;
            break;
        }
    }

    int lp=breaking_point+1;//smallest element
    int rp=breaking_point;//largest

    while(lp!=rp){
       //case1
       
       if(list2.get(lp)+list2.get(rp)==target2){
        return true;
       }

       //case2 
       if(list2.get(lp)+list2.get(rp)<target2){
        lp=(lp+1)%n;

       }

       //case3
       if(list2.get(lp)+list2.get(rp)>target2){
        rp=(n+rp-1)%n;
       }
    }

    return false;
}

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        //1,2,3,4,5,6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        int target=5;

         ArrayList<Integer>list2=new ArrayList<>();
        //11,15,6,8,9,10
        list2.add(11);
        list2.add(15);
        list2.add(6);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        int target2=15;

        System.out.println(pairsum1(list, target));
        System.out.println(two_pointer_pair_sum1(list, target));

        System.out.println(pair_sum_2(list2, target2));//two pointer method only 

    } 
}
