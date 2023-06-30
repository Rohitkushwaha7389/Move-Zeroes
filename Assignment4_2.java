mport java.util.ArrayList;
import java.util.Arrays;

public class Assignment4_2 {
    public static void main(String[] args) {
        
        int v[]={1,2,3};
        int m[]={2,4,6}; 
        int k[][] = new int[2][2];
    ArrayList<Integer>k1=new ArrayList<>();
    ArrayList<Integer>k2=new ArrayList<>();
int s=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(v[i]==m[j]){
                    break;}
                    else{s=1;
                }
            
            }if(s==1){
                k1.add(v[i]);
                s=0;
            }

        }
        // System.out.println(k1);
         for (int i = 1; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                if(m[i]==v[j]){ break;}
                    else{ s=1;}
               

            }if(s==1){
                k2.add(m[i]);
                s=0;
            }

        }   
      //  System.out.println(k2);
        k[0]=k1.stream().mapToInt(Integer::intValue).toArray();
         k[1]=k2.stream().mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
               System.out.println(k[i][j]);
            }
        }
    }
}
