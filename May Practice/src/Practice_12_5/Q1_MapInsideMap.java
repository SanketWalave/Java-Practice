package Practice_12_5;

import java.util.*;
public class Q1_MapInsideMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,HashMap> bmap=new HashMap<>();
        HashMap<Integer,String> smap1=new HashMap<>();
        smap1.put(1,"ram");
        smap1.put(2,"Sam");
        HashMap<Integer,String> smap2=new HashMap<>();
        smap2.put(1,"Ganesh");
        smap2.put(2,"Manesh");
        bmap.put("Ind",smap1);
        bmap.put("Os",smap2);
        for(Map.Entry<String,HashMap> e1:bmap.entrySet()){
            System.out.println("================="+e1.getKey()+"===================");
            HashMap<Integer,String> inn=(HashMap<Integer, String>) e1.getValue();
            System.out.println("id\t\tname");
        for(Map.Entry<Integer,String> e2:inn.entrySet()){
            System.out.println(e2.getKey()+" \t\t"+e2.getValue());
        }
        }
    }
}
