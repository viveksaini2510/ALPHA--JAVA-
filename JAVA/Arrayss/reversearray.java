public class reversearray {

    public static void revarr(int arr[]){
        int start=0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=arr[temp];
            
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,78,9,10};

        revarr(arr);
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
