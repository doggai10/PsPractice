package algorithm.programmers;

import java.io.*;
import java.util.*;
import static java.lang.Integer.*;


class TrieNode{
    int size = 10;
    boolean isEnd;
    TrieNode[] child  = new TrieNode[size];

    public TrieNode(){
        this.isEnd = false;
        for(int i =0 ; i<size; i++){
            child[i]=null;
        }
    }

    public boolean isExistChild(){
        for(int i=0; i<size;i++){
            if(child[i]!=null) return true;
        }
        return false;
    }
}

class Trie{
    TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    public void insert(String key){
        TrieNode temp = this.root;
        for(int i=0; i<key.length();i++){
            int idx = key.charAt(i)-'0';
            if(temp.child[idx]==null) {
                temp.child[idx]=new TrieNode();
            }
            temp= temp.child[idx];
        }
        temp.isEnd=true;
    }

    public boolean hasPrefix(String key){
        TrieNode temp = this.root;
        for(int i=0; i<key.length();i++){
            int idx = key.charAt(i)-'0';
            if(temp.isEnd && temp.isExistChild()) return true;
            temp = temp.child[idx];
        }
        return false;
    }
}

public class phonebook {

    public static BufferedReader br;
    public static BufferedWriter bw;
    public static StringBuilder sb;
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        br= new BufferedReader(new InputStreamReader(System.in));
        bw= new BufferedWriter(new OutputStreamWriter(System.out));
        sb = new StringBuilder();

        String[] phone_book={"119", "97674223", "1195524421"};
        boolean answer = true;
        Trie trie = new Trie();
        for(int i=0; i<phone_book.length;i++){
            trie.insert(phone_book[i]);
        }
        for(int i=0; i<phone_book.length;i++){
            if(trie.hasPrefix(phone_book[i])){
                answer=false;
                break;
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}