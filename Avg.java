import java.util.Scanner;
class Avg{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of item ");
        int n=sc.nextInt();
         int a[]=new int[n];
         int i,sum=0;
         int l=a.length;
         System.out.println("Enter item one by one ");

         for(i=0; i<a.length; i++){

          a[i]=sc.nextInt();
         }
         i=0;
         do{
            sum+=a[i];
            i++;
         }while(i<l);

       
      System.out.println( "Avarage of list is :-  "+sum/l);

        
       }
    }
