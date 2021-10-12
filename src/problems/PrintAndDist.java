package problems;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class PrintAndDist {
    public static void main(String[] args){
        //System.out.println("Arthi");

        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Enter array size");
        n=input.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        Arrays.sort(a);
        HashMap <Integer,Integer> m=new HashMap<>();
        for(int i=0; i<n; i++){
            m.put(a[i],i);
        }
        System.out.println(m.size());
        System.out.println(m.keySet());
        //System.out.println(m);
    }
}
