import java.util.*;
public class rainwatertrapped {
    public static int trappedrainwater(int height[]){
        int n = height.length;

        //compute left max boundary
        int leftmax[]= new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n ;i++){
            leftmax[i]=Math.max(leftmax[i-1], height[i]);
        }

        // compute right max boundary
        int rightmax[]= new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1], height[i]);
        }

    
        

        int watertrapped=0;
        for(int i=0; i<n; i++){

        // water level = min(leftmax,rightmax)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            
        // water trapped = water level - height[i]
            watertrapped+=waterlevel- height[i];
        }
        return watertrapped;
        
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedrainwater(height));
    }
}
