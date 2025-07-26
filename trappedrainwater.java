public class trappedrainwater {

    public static int trappedrainwater1(int height[]){

        //calculate left boundary - aux array

        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
          leftmax[i]=Math.max(height[i],leftmax[i-1]);

        }

        //calculate right boundary -aux array

        int rightmax[]= new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
          rightmax[i]=Math.max(height[i],rightmax[i+1]);

        }
        int trappedwater=0;
        //loop
        for(int i=0;i<height.length;i++){

         //water level=min(left bound, right bound)
          int waterlevel=Math.min(leftmax[i],rightmax[i]);

        //trapped water = waterlevel - weight[i]
          trappedwater+=waterlevel -height[i];
        }
        
     
          return trappedwater;
      }


    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        int result=trappedrainwater1(height);
        System.out.println("trapped water :"+result);
    }
    
}
