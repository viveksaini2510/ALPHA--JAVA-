public class abc {

    public static boolean prime(int n){
        if (n==2){
            return true;
        }
        for(int i = 2 ; i<= Math.sqrt(n); i++){
            if(n % i== 0){
                return false;
            }
        }
        return true;
    }

    public static void printinrange(int n){
        for(int i =2 ; i<n; i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printinrange(20);
    }
    
}
