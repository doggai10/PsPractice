import java.util.Scanner;

public class graph1 {

    public static final Scanner sc = new Scanner(System.in);
    public static int[] parent;
    public static int n,m;

    public static int findParent(int x){
        if(parent[x]==x){
            return x;
        }
        return parent[x]=findParent(parent[x]);
    }

    public static void unionParent(int a, int b){
        a = findParent(a);
        b = findParent(b);
        if(a<b){
            graph1.parent[b]=a;
        }else{
            graph1.parent[a]=b;
        }
    }
    public static void main(String[] args) {
        n=sc.nextInt();
        m=sc.nextInt();
        parent= new int[n+1];
        for(int i=0; i<=n;i++){
            parent[i]=i;
        }
        for(int i=0; i<m;i++){
            int type=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(type==0){
                unionParent(a,b);
            }else{
                if(findParent(a)==findParent(b)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
