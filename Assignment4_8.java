import java.util.ArrayList;
import java.util.Arrays;
public class Assignment4_8{
    public static void main(String[] args) {
  
int a[]={2,5,1,3,4,7};
  ArrayList<Integer>kam=new ArrayList<>();
    ArrayList<Integer>kam1=new ArrayList<>();
 ArrayList<Integer>k=new ArrayList<>();
  for (int i = 0; i < a.length/2; i++) {
    kam.add(a[i]);
  }
   
  for (int i =  a.length/2; i < a.length; i++) {
    kam1.add(a[i]);
    
  }
  for (int i = 0; i < a.length/2; i++) {
    k.add(kam.get(i));
    k.add(kam1.get(i));

   

    
  } //System.out.print( k);
  Integer[] k2=k.toArray(new Integer[6]);
  for(int i:k2){
    System.out.println(i);
  }

    
}
}
