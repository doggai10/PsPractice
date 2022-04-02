package algorithm.baekjoon;

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

class Problem implements Comparable<Problem>{
    int p;
    int l;

    public Problem(int p, int l) {
        this.p = p;
        this.l = l;
    }

    @Override
    public int compareTo(Problem o) {
        if(this.l == o.l){
            return Integer.compare(this.p , o.p);
        }
        return Integer.compare(this.l,o.l);
    }
}

class sol_21939{
    public static BufferedReader br;
    public static BufferedWriter bw;
    public static StringBuilder sb;
    public static StringTokenizer st;
    public static Map<Integer, Integer> map = new HashMap<>();
    public static TreeSet<Problem> ts = new TreeSet<>();
    public static void main(String[] args) throws IOException{
        br= new BufferedReader(new InputStreamReader(System.in));
        bw= new BufferedWriter(new OutputStreamWriter(System.out));
        sb = new StringBuilder();
        int n= parseInt(br.readLine());
        boolean[] solved = new boolean[100005];
        for(int i=0; i<n;i++){
            st= new StringTokenizer(br.readLine());
            int p = parseInt(st.nextToken());
            int l = parseInt(st.nextToken());
            map.put(p, l);
            ts.add(new Problem(p, l));
        }
        int m = parseInt(br.readLine());
        for(int i=0; i<m;i++){
            st= new StringTokenizer(br.readLine());
            String type = st.nextToken();
            if(type.equals("add")){
                int p = parseInt(st.nextToken());
                int l = parseInt(st.nextToken());
                map.put(p, l);
                ts.add(new Problem(p, l));
            }else if(type.equals("recommend")){
                int l = parseInt(st.nextToken());
                if(l==1){
                    sb.append(ts.last().p).append("\n");
                }else{
                    sb.append(ts.first().p).append("\n");

                }
            }else if(type.equals("solved")){
                int p = parseInt(st.nextToken());
                ts.remove(new Problem(p, map.get(p)));
                map.remove(p);
            }

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}