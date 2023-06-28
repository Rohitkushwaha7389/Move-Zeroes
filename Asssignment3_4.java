import java.util.*;

public classAsssignment3_4 {
    public static void main(String[] args) {
        int k[] = { 1,3,5,6};
        int n=5;
        Arrays.sort(k);
        System.out.println( findSingle(k,n));
 
    }
    private static int findSingle(int k[],int n){
        
        int p=-1; 
        for (int i = 0; i < k.length; i++) {
            if(n==k[i]){
                p=i;
            }
            
        }
        return p;
    }

}
