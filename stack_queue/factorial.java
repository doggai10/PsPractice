public class factorial {

    public static int factorialIterative(int n){
        int result=1;

        for(int i=1; i<=n;i++){
            result*=i;
        }
        return  result;
    }

    public static int factorialRecursive(int n){
        if( n<=1){
            return 1;
        }
        return  n * factorialIterative(n-1);
    }

    public static void main(String[] args) {
        System.out.println("factorialIterative(5) = " + factorialIterative(5));
        System.out.println("factorialRecursive(5) = " + factorialRecursive(5));
    }
}
