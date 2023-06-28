import java.util.*;

public class Asssignment3_5 {
    public static void main(String[] args) {
        int k[] = { 2,2,3,3};
       // Arrays.sort(k);
       // System.out.println();
            findSingle(k,k.length-1);
 
    }
    private static int findSingle(int k[],int n){
        
        int p=k[0];
        k[n]=p+k[n];

        // Arrays.sort(k);
         for (int i = 0; i < k.length; i++) {
             System.out.print(k[i]);
         }
          return k[k.length-1];
    }

}
