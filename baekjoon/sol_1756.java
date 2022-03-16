package algorithm.baekjoon;

import java.io.*;
import java.util.*;
import static java.lang.Integer.*;

public class sol_1756 {

    public static BufferedReader br;
    public static BufferedWriter bw;
    public static StringBuilder sb;
    public static StringTokenizer st;
    public static int n,d,res;
    public static int [] arr= new int[300005];

    public static void main(String[] args) throws IOException{
        br= new BufferedReader(new InputStreamReader(System.in));
        bw= new BufferedWriter(new OutputStreamWriter(System.out));
        sb = new StringBuilder();
        input();
        search();
        sb.append(++res);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        d= parseInt(st.nextToken());
        n= parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int compValue = parseInt(st.nextToken());
        arr[0]=compValue;
        for(int i=1; i<d;i++){
            int temp = parseInt(st.nextToken());
            compValue = Math.min(compValue,temp);
            arr[i]=compValue;
        }
        res=(int)1e9;
    }

    public static void search() throws IOException {
        int last = d;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n;i++){
            int add = parseInt(st.nextToken());
            int find =binarySearch( add,  last);
            res = Math.min(res,find);
            last = find;
            if(find ==-1) {
                break;
            }
        }
    }

    public static int binarySearch( int comp, int end){
        int  start=0, idx =-1;
        while(start <end){
            int mid = (start+end)>>1;
            if(arr[mid]>=comp){
                start=mid+1;
                idx=mid;
            }else{
                end=mid;
            }
        }
        return idx;
    }
}