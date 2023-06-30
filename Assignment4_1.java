import java.util.ArrayList;
import java.util.Arrays;
public class Assignment4_1{
    public static void main(String[] args) {
        ArrayList<Integer>kam=new ArrayList<>(Arrays.asList(1,2,3,34,4,5,5,5,43));
        ArrayList<Integer>kam1=new ArrayList<>(Arrays.asList(1,3,4,6,8,9));
        ArrayList<Integer>kam2=new ArrayList<>(Arrays.asList(1,2,3,34,4,1,3));
        ArrayList<Integer>k=new ArrayList<>();

        for (int i = 0; i < kam.size(); i++) {
            if(kam1.contains(kam.get(i))==true){
             int p= kam.get(i);
              if(kam2.contains(kam.get(i))==true){
                System.out.print(kam.get(i)+" ");

              }
            }
            
        }  
    
}}
