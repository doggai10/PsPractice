package algorithm.dp;

public class Fibonacci {

    public static long[] d = new long[100];


    public static int fibo(int x){
        if (x==1 || x==2){
            return 1;
        }
        return  fibo(x-1)+fibo(x-2);
    }

    public static long fiboTopDown(int x){
        if(x==1 || x==2){
            return 1;
        }
        if(d[x]!=0){
            return d[x];
        }
        d[x]=fiboTopDown(x-1)+fiboTopDown(x-2);
        return d[x];
    }



    public static void main(String[] args) {
        System.out.println(fibo(5));

        d[1]=1;
        d[2]=1;

        for(int i=3; i<=50;i++){
            d[i]=d[i-1]+d[i-2];
        }
        System.out.println(d[50]);
        System.out.println(fiboTopDown(50));
    }
}
